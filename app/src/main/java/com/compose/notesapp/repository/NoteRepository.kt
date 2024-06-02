package com.compose.notesapp.repository

import com.compose.notesapp.data.NoteDatabaseDao
import com.compose.notesapp.model.Note
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDatabaseDao: NoteDatabaseDao) {

    suspend fun addNote(note: Note) = noteDatabaseDao.insert(note)

    suspend fun updateNote(note: Note) = noteDatabaseDao.update(note)

    suspend fun deleteNote(note: Note) = noteDatabaseDao.deleteNote(note)

    suspend fun deleteAllNotes() = noteDatabaseDao.deleteAll()

    fun getAllNotes(): Flow<List<Note>> = noteDatabaseDao.getNotes().flowOn(IO).conflate()


}