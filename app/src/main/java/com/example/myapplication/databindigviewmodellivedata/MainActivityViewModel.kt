package com.example.myapplication.databindigviewmodellivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingCount: Int): ViewModel() {
    private var count = MutableLiveData<Int>()
    val countData: LiveData<Int>
    get() = count

    var userName = MutableLiveData<String>()


    init {
        count.value = startingCount
        userName.value = "Frank (two way DB)"
    }
    fun updateCount() {
//        count.value?.let { count.value = it + 1 }
        count.value = count.value?.plus(1)
    }
}