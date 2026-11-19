package com.assignment.fundamentals_test.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    val title : String? = null,
    val content : String? = null,
    val createdAt : Long = 0L
)