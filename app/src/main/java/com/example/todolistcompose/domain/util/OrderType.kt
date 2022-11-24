package com.example.todolistcompose.domain.util

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
