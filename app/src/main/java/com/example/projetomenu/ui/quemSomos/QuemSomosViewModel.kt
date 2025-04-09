package com.example.projetomenu.ui.quemSomos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuemSomosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Quem Somos"
    }
    val text: LiveData<String> = _text
}