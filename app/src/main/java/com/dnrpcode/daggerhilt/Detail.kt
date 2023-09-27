package com.dnrpcode.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Detail : AppCompatActivity() {
//    private val viewModel: MainViewModel by viewModels()
    @Inject
    lateinit var engine: Engine
//     var engine= Engine(this, "dani")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
//        viewModel.start()
        engine.startEngine()
    }
}