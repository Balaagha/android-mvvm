package com.example.myapplication.dagger.model

import android.util.Log
import javax.inject.Inject

class SIMCart @Inject constructor(private val serviceProvider: ServiceProvider) {
    init {
        Log.i("MYTAG","on SIMCart in init")
    }

    fun getConnection() {
        Log.i("MYTAG","on SIMCart in getConnection")
        serviceProvider.getServiceProvider()
    }
}