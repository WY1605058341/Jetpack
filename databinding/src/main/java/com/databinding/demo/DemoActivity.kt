package com.databinding.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.databinding.R
import com.databinding.User
import com.databinding.databinding.ActivityDemoBinding

class DemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDemoBinding
    private lateinit var user: DemoUser


    private lateinit var viewModel: DemoViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_demo)

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
                .get(DemoViewModel::class.java)

        binding.setLifecycleOwner(this)
        binding.vm = viewModel


        user = DemoUser()

        viewModel.liveDataUser.postValue(user)










    }



}