package com.assignment.fundamentals_test.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.assignment.fundamentals_test.data.entity.NoteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note : NoteEntity) : Long

    @Update
    suspend fun updateNote(note : NoteEntity) : Int

    @Delete
    suspend fun deleteNote(note : NoteEntity) : Int

    @Query("DELETE FROM notes WHERE id = :noteId")
    suspend fun deleteById(noteId : Long) : Int

    @Query("SELECT * FROM notes WHERE id=:noteId")
    suspend fun getNote(noteId : Long) : NoteEntity?

    @Query("SELECT * FROM notes ORDER BY createdAt DESC")
    fun getAllNotes() : Flow<List<NoteEntity>>
}