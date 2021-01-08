package com.example.myapplication.dagger

import com.example.myapplication.dagger.model.SmartPhone
import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone(): SmartPhone
}