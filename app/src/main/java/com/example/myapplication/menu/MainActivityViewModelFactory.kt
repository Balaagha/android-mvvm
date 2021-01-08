package com.example.myapplication.menu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databindigviewmodellivedata.MainActivityViewModel
import java.lang.IllegalArgumentException

class MainActivityViewModelFactory(private val startingTotal: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknow View Model Class")
    }

}
