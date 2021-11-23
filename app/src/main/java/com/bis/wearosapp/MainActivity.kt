package com.bis.wearosapp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.bis.wearosapp.databinding.ActivityMainBinding


class MainActivity : Activity() {

private lateinit var binding: ActivityMainBinding
    lateinit var tw:TextView
    lateinit var text:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)

        tw = findViewById(R.id.texto)


    }

    fun pushale(view:View){
        tw.text = "cola"

    }


}