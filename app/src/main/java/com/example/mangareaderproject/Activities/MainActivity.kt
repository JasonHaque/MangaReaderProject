package com.example.mangareaderproject.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mangareaderproject.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appstart()
    }

    fun appstart(){
        val intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
    }
}
