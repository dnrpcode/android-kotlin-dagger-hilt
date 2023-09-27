package com.dnrpcode.daggerhilt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var engine: Engine
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        viewModel.start()
//        viewModel.setName("dani")
        engine.setSpeed(150)
        println("isi di main ${engine.getSpeed()}")


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Detail::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}