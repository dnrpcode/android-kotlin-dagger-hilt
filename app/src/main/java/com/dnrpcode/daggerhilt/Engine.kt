package com.dnrpcode.daggerhilt

import android.content.Context

class Engine(val context: Context, val owner: String)  {
    private var speed: Number = 0
    fun startEngine(){
        println("${context.getString(R.string.engine_started)} by $owner")
        println("Speed Engine: $speed")
    }

    fun setSpeed(speed: Number) {
        this.speed = speed
    }

    fun getSpeed(): Number {
        return this.speed;
    }
}