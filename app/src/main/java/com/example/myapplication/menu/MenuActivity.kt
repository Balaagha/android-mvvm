package com.example.myapplication.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.androidjetpackcleanarchitecturetestting.AjcatActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        androidJetpackCleanArchitectureTestting.setOnClickListener {
            var newIntent = Intent(this@MenuActivity, AjcatActivity::class.java);
            startActivity(newIntent)
        }

    }
}