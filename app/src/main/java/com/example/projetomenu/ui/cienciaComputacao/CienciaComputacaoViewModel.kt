package com.example.projetomenu.ui.cienciaComputacao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CienciaComputacaoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ciência da Computação"
    }
    val text: LiveData<String> = _text
}