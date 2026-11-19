package com.assignment.fundamentals_test.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.assignment.fundamentals_test.data.dao.NoteDao
import com.assignment.fundamentals_test.data.entity.NoteEntity

@Database(version = 1, entities = [NoteEntity::class], exportSchema = false)
abstract class NotesDatabase : RoomDatabase() {
    abstract fun noteDao() : NoteDao
}