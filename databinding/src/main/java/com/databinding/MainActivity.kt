package com.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.databinding.databinding.ActivityMainBinding
import com.databinding.demo.DemoActivity
import com.databinding.one.OneWayBindingActivity
import com.databinding.two.TwoWayActivity

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var user = User(10, "ZZZ")
        binding.userBean = user

        //手动设置
//        binding.tvName.text = ""


        binding.btnOneWay.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, OneWayBindingActivity::class.java)
            startActivity(intent)
        })

        binding.btnTrans.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TwoWayActivity::class.java)
            startActivity(intent)

        })

        binding.btnDemo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, DemoActivity::class.java)
            startActivity(intent)
        })


    }


}
