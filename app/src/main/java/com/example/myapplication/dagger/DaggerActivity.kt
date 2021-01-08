package com.example.myapplication.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.dagger.model.*

class DaggerActivity : AppCompatActivity() {
    private lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)

//        val smartPhone = SmartPhone(Battery(), SIMCart(), MemoryCard())
//            .makeACallWithRecording()
        DaggerSmartPhoneComponent.create()
            .getSmartPhone()
            .makeACallWithRecording()
    }
}