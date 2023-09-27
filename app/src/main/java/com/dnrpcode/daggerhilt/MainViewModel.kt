package com.dnrpcode.daggerhilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val engine: Engine
) : ViewModel() {
    private var name: String = ""
    fun start(){
        engine.startEngine()
        println("name: ${this.name}")
    }

    fun setName(name: String) {
        this.name = name
    }
}