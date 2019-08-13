package com.netzwelt.mynotes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteViewModel : ViewModel() {

    private var notes = MutableLiveData<ArrayList<Note>>()

    fun addNote(note: Note) {
        notes.value?.add(note)
    }

    fun getNotes(): MutableLiveData<ArrayList<Note>> {
        return notes
    }

}