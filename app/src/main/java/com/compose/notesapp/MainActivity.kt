package com.compose.notesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.compose.notesapp.screen.NoteScreen
import com.compose.notesapp.screen.NoteViewModel
import com.compose.notesapp.ui.theme.NotesAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NotesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel = viewModel<NoteViewModel>()
                    NoteApp(viewModel)
                }
            }
        }
    }

    @Composable
    fun NoteApp(viewModel: NoteViewModel) {
        val notesList = viewModel.noteList.collectAsState().value
        NoteScreen(notes = notesList,
            onRemoveNote = { note -> viewModel.removeNote(note = note) },
            onAddNote = { note -> viewModel.addNote(note) })
    }
}

