package com.compose.notesapp.data

import com.compose.notesapp.model.Note

class NoteDataSource {

    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Title 1", description = "Description 1"),
            Note(title = "Title 2", description = "Description 2"),
            Note(title = "Title 3", description = "Description 3"),
            Note(title = "Title 4", description = "Description 4"),
            Note(title = "Title 5", description = "Description 5"),
            Note(title = "Title 6", description = "Description 6"),
            Note(title = "Title 7", description = "Description 7"),
            Note(title = "Title 8", description = "Description 8"),
            Note(title = "Title 9", description = "Description 9"),
            Note(title = "Title 10", description = "Description 10"),
            Note(title = "Title 11", description = "Description 11"),
            Note(title = "Title 12", description = "Description 12"),
            Note(title = "Title 13", description = "Description 13"),
            Note(title = "Title 14", description = "Description 14"),
            Note(title = "Title 15", description = "Description 15"),
        )
    }
}