package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model.DataBindingTwoWayActivityViewModel
import com.example.myapplication.databinding.ActivityDataBindingTwoWayBinding

class DataBindingTwoWayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingTwoWayBinding
    private lateinit var viewModel: DataBindingTwoWayActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding_two_way)
        viewModel = ViewModelProvider(this).get(DataBindingTwoWayActivityViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

    }
}