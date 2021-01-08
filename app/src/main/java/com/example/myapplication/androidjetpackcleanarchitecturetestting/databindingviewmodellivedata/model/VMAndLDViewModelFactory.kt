package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class VMAndLDViewModelFactory(private val startingCount: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ViewModelIntroViewModel::class.java)){
            return ViewModelIntroViewModel(startingCount) as T
        }else if(modelClass.isAssignableFrom(LiveDataIntroViewModel::class.java)){
            return LiveDataIntroViewModel(startingCount) as T
        }
        throw IllegalArgumentException("Unknown View Model Class ")
    }

}