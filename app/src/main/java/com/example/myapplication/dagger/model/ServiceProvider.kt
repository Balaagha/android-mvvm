package com.example.myapplication.dagger.model

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor(){
    init {
        Log.i("MYTAG","on ServiceProvider in init")
    }
    fun getServiceProvider() {
        Log.i("MYTAG","on ServiceProvider in getServiceProvider")
    }
}