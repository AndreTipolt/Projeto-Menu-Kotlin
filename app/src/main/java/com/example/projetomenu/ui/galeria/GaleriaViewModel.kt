package com.example.projetomenu.ui.galeria

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GaleriaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Galeria"
    }
    val text: LiveData<String> = _text
}