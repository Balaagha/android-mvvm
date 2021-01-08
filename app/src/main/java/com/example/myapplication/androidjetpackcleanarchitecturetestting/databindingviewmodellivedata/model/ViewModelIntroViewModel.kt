package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model

import androidx.lifecycle.ViewModel

class ViewModelIntroViewModel(startingCount: Int): ViewModel() {
    private var count = 0

    init {
        count = startingCount
    }

    fun getCurrentCount():Int {
        return count
    }

    fun getUpdatedCount(): Int{
        return ++count
    }

    fun setCount(input: Int){
        count += input
    }

}