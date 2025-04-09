package com.example.projetomenu.ui.contato

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContatoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Contato"
    }
    val text: LiveData<String> = _text
}