package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.model.Student
import com.example.myapplication.databinding.ActivityDataBindingIntroBinding

class DataBindingIntro : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_binding_intro)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding_intro)
        binding.dbButton.setOnClickListener {
            displayGreating()
        }
        binding.dbButtonStart.setOnClickListener {
            startOrStopProgressBar()
        }

        binding.student = getStudent()
    }

    private fun startOrStopProgressBar() {
        binding.apply {
            if (dbProgressBar.visibility == View.GONE){
                dbProgressBar.visibility = View.VISIBLE
                dbButtonStart.text = "Stop"
            }else{
                dbProgressBar.visibility = View.GONE
                dbButtonStart.text = "Start"
            }
        }
    }

    private fun displayGreating(){
        binding.apply {
            dbTextView.text = "Hello! " + dbEditText.text
        }
    }

    private fun getStudent(): Student {
        return Student(1,"Alex","alex@gmail.com")
    }
}