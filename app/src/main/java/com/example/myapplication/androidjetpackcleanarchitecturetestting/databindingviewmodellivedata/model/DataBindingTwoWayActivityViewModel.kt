package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataBindingTwoWayActivityViewModel: ViewModel() {
    val userName = MutableLiveData<String>()

    init {
        userName.value = "Frank"
    }
}