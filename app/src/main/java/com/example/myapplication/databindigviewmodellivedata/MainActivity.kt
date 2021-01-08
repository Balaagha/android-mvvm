package com.example.myapplication.databindigviewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.menu.MainActivityViewModelFactory
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
// Implement Data Binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
// Implement ViewModel and ViewModelFactory
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
// Implement Live Data
        viewModel.countData.observe(this, Observer {
            binding.txtCount.text = it.toString()
        })
// Implementing Live Data with data binding (bunun ucun => android:text="@{String.valueOf(viewmodel.count)}" )
        binding.lifecycleOwner = this // in Fragment it is -> viewLife
// Implement object type DataBinding variable (In activity_main this variable => student )
        binding.student = Student(1, "Alex", "alex@gmail.com")
//  Implement viewmodel in activity_main
        binding.viewmodel = viewModel

        binding.btn1.setOnClickListener {
            binding.apply {
                txt1.text = "Heelo " + edtTxt.text
            }
        }
        binding.btn2.setOnClickListener {
            viewModel.updateCount()
        }
    }

    private fun displayGrating() {

    }
}