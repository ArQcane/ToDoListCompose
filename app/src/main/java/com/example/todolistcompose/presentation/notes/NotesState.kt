package com.example.todolistcompose.presentation.notes

import com.example.todolistcompose.domain.model.Note
import com.example.todolistcompose.domain.util.NoteOrder
import com.example.todolistcompose.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false

)
