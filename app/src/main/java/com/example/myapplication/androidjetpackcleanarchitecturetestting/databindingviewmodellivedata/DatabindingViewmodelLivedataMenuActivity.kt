package com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.view.*
import kotlinx.android.synthetic.main.activity_databinding_viewmodel_livedata_menu.*

class DatabindingViewmodelLivedataMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_databinding_viewmodel_livedata_menu)

        dataBindingIntro.setOnClickListener {
            var newIntent = Intent(this@DatabindingViewmodelLivedataMenuActivity, DataBindingIntro::class.java)
            startActivity(newIntent)
        }
        dataBindingTwoWay.setOnClickListener {
            var newIntent = Intent(this@DatabindingViewmodelLivedataMenuActivity, DataBindingTwoWayActivity::class.java)
            startActivity(newIntent)
        }

        viewModelIntro.setOnClickListener {
            var newIntent = Intent(this@DatabindingViewmodelLivedataMenuActivity, ViewModelIntro::class.java)
            startActivity(newIntent)
        }

        liveDataIntro.setOnClickListener {
            var newIntent = Intent(this@DatabindingViewmodelLivedataMenuActivity, LiveDataIntro::class.java)
            startActivity(newIntent)
        }

        viewModelAndLiveDataWithDataBindingIntro.setOnClickListener {
            var newIntent = Intent(this@DatabindingViewmodelLivedataMenuActivity, ViewModelAndLiveDataWithDataBinding::class.java)
            startActivity(newIntent)
        }



    }
}