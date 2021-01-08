package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataIntroViewModel(startingCount: Int = 10): ViewModel() {
    private var count = MutableLiveData<Int>()
    val countData: LiveData<Int> get() = count

    init {
        count.value = startingCount
    }

    fun increaseCount() {
        count.value = (count.value)?.plus(1)
    }

    fun setCount(input: Int){
        count.value = (count.value)?.plus(input)
    }

}