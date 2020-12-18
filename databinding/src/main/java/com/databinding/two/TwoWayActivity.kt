package com.databinding.two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.databinding.R
import com.databinding.databinding.ActivityOneWayBindingBinding
import com.databinding.databinding.ActivityTwoWayBinding
import com.databinding.one.OneWayUser

/**
 * 双向绑定
 */
class TwoWayActivity : AppCompatActivity() {

    private lateinit var bindingOneWay: ActivityTwoWayBinding

    private lateinit var user: TwoWayUser


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_two_way)


        bindingOneWay = DataBindingUtil.setContentView(this, R.layout.activity_two_way)

        user = TwoWayUser()

        bindingOneWay.userBean = user
        bindingOneWay.listener = Listener(user)


        bindingOneWay.button1.setOnClickListener(View.OnClickListener {
            user.age.set(10)
            user.name.set("张三")
        })

        bindingOneWay.button2.setOnClickListener(View.OnClickListener {

        })


    }


    class Listener(val user: TwoWayUser) {
        fun changeAge() {
            user.age.set(user.age.get()?.plus(1))
        }
    }
}