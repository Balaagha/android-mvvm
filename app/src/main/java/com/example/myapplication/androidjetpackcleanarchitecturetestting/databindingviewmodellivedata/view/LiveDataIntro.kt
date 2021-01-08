package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model.LiveDataIntroViewModel
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model.ViewModelIntroViewModel
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model.VMAndLDViewModelFactory
import com.example.myapplication.databinding.ActivityLiveDataIntroBinding
import com.example.myapplication.databinding.ActivityViewModelIntroBinding

class LiveDataIntro : AppCompatActivity() {
    private lateinit var binding: ActivityLiveDataIntroBinding
    private lateinit var viewModel: LiveDataIntroViewModel
    private lateinit var viewModelFactory: VMAndLDViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_live_data_intro)
        viewModelFactory = VMAndLDViewModelFactory(1)
        viewModel = ViewModelProvider(this,viewModelFactory).get(LiveDataIntroViewModel::class.java)

        viewModel.countData.observe(this, Observer {
            binding.tvCount.text = it.toString()
        })
        addInputToCount()
    }

    private fun addInputToCount() {
        binding.apply {
            btnAdding.setOnClickListener {
                viewModel.setCount(editTextAddingNumber.text.toString().toInt())
            }
        }
    }

}