package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model.ViewModelIntroViewModel
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model.VMAndLDViewModelFactory
import com.example.myapplication.databinding.ActivityViewModelIntroBinding

class ViewModelIntro : AppCompatActivity() {
    private lateinit var binding: ActivityViewModelIntroBinding
    private lateinit var viewModel: ViewModelIntroViewModel
    private lateinit var viewModelFactory: VMAndLDViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_model_intro)
        viewModelFactory = VMAndLDViewModelFactory(1)
        viewModel = ViewModelProvider(this,viewModelFactory).get(ViewModelIntroViewModel::class.java)

        binding.tvCount.text = viewModel.getCurrentCount().toString()

        increaseCount()
        addInputToCount()
    }

    private fun addInputToCount() {
        binding.apply {
            btnAdding.setOnClickListener {
                viewModel.setCount(editTextAddingNumber.text.toString().toInt())
                tvCount.text = viewModel.getCurrentCount().toString()
            }
        }
    }

    private fun increaseCount(){
        binding.apply {
            btnIncrease.setOnClickListener {
                tvCount.text = viewModel.getUpdatedCount().toString()
            }
        }
    }

}