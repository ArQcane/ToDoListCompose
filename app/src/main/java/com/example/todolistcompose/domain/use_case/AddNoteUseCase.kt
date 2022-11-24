package com.example.todolistcompose.domain.use_case

import com.example.todolistcompose.domain.model.InvalidNoteException
import com.example.todolistcompose.domain.model.Note
import com.example.todolistcompose.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("The title of the note cant be empty.")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content of the note cant be empty.")
        }
        repository.insertNote(note)
    }
}