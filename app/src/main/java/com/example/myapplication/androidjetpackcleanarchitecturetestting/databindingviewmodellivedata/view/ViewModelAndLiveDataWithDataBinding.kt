package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model.LiveDataIntroViewModel
import com.example.myapplication.databinding.ActivityViewModelWithDataBindingBinding

class ViewModelAndLiveDataWithDataBinding : AppCompatActivity() {
    private lateinit var binding: ActivityViewModelWithDataBindingBinding
    private lateinit var viewModel: LiveDataIntroViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_model_with_data_binding)
        viewModel = ViewModelProvider(this).get(LiveDataIntroViewModel::class.java)

        binding.lifecycleOwner = this // Livedata ni databinding ile istifade etmek ucundur
        binding.viewModel = viewModel
    }

}