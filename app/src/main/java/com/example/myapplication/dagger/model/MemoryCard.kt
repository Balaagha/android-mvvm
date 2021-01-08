package com.example.myapplication.dagger.model

import android.util.Log
import javax.inject.Inject

class MemoryCard @Inject constructor(){
    init {
        Log.i("MYTAG","on MemoryCard in init")
    }
    fun getSpaceAvailablity() {
        Log.i("MYTAG","on MemoryCard in getSpaceAvailablity")
    }
}