package com.example.projetomenu.ui.analiseDesenvolvimentoSistema

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnaliseDesenvolvimentoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Análise e Desenvolvimento de Sistemas"
    }
    val text: LiveData<String> = _text
}