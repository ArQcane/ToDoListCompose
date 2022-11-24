package com.example.todolistcompose.domain.use_case

import com.example.todolistcompose.domain.model.Note
import com.example.todolistcompose.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}