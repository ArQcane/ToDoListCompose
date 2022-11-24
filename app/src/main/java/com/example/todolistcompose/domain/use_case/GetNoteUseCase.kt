package com.example.todolistcompose.domain.use_case

import com.example.todolistcompose.domain.model.Note
import com.example.todolistcompose.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}