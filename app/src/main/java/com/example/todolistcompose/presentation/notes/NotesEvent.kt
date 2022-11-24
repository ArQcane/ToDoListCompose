package com.example.todolistcompose.presentation.notes

import com.example.todolistcompose.domain.model.Note
import com.example.todolistcompose.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
