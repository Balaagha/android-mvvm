package com.example.myapplication.dagger.model

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(val battery: Battery, val simCart: SIMCart, val memoryCard: MemoryCard) {
    init {
        battery.getPower()
        simCart.getConnection()
        memoryCard.getSpaceAvailablity()
        Log.i("MYTAG","on SmartPhone in init")
    }

    fun makeACallWithRecording(){
        Log.i("MYTAG","on SmartPhone in makeACallWithRecording")
    }

}