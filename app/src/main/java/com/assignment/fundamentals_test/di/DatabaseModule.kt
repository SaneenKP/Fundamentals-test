package com.assignment.fundamentals_test.di

import android.content.Context
import androidx.room.Room
import com.assignment.fundamentals_test.data.dao.NoteDao
import com.assignment.fundamentals_test.data.database.NotesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideNotesDatabase(@ApplicationContext context : Context) : NotesDatabase{
        return Room.databaseBuilder(context, NotesDatabase::class.java, "notes_database.db").build()
    }

    @Provides
    @Singleton
    fun provideNotesDao(database: NotesDatabase) : NoteDao {
        return database.noteDao()
    }
}