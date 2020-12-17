package com.databinding.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.databinding.R
import com.databinding.databinding.ActivityOneWayBindingBinding

/**
 * 单向绑定
 */
class OneWayBindingActivity : AppCompatActivity() {


    private lateinit var bindingOneWay: ActivityOneWayBindingBinding

    private lateinit var user: OneWayUser


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingOneWay = DataBindingUtil.setContentView(this, R.layout.activity_one_way_binding)

        user = OneWayUser()

        bindingOneWay.userBean = user

        bindingOneWay.button1.setOnClickListener(View.OnClickListener {
            user.age.set(10)
            user.name.set("张三")
        })

        bindingOneWay.button2.setOnClickListener(View.OnClickListener {

        })

    }
}