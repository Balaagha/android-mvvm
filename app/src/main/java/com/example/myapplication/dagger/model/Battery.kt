package com.example.myapplication.dagger.model

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){
    init {
        Log.i("MYTAG","on Battery in init")
    }
    fun getPower() {
        Log.i("MYTAG","on Battery in getPower")
    }
}