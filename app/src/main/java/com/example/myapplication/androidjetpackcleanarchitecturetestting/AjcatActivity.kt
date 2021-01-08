package com.example.myapplication.androidjetpackcleanarchitecturetestting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.androidjetpackcleanarchitecturetestting.databindingviewmodellivedata.DatabindingViewmodelLivedataMenuActivity
import kotlinx.android.synthetic.main.activity_ajcat.*

class AjcatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ajcat)
        dataBindingSection.setOnClickListener{
            var newIntent = Intent(this@AjcatActivity, DatabindingViewmodelLivedataMenuActivity::class.java)
            startActivity(newIntent)
        }

    }


}