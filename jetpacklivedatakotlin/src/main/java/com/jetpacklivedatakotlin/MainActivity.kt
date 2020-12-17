package com.jetpacklivedatakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberDisplay = findViewById<Button>(R.id.number_display)
        val start = findViewById<Button>(R.id.btn_start)
        val stop = findViewById<Button>(R.id.btn_stop)


        var mainViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
                .get(MainViewModel::class.java)

        mainViewModel.liveDataI.observe(this, Observer {
            numberDisplay.text = it.toString()
        })

        start.setOnClickListener {
            mainViewModel.start()
        }


        stop.setOnClickListener {
            mainViewModel.stop()
        }


    }
}