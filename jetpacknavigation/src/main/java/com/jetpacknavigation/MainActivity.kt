package com.jetpacknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var controller: NavController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(controller.graph)
        setupActionBarWithNavController(controller, appBarConfiguration)

//        controller.addOnDestinationChangedListener{
//            controller, destination, arguments ->
//
//            Log.e("WY",""+destination.toString())
//            Log.e("WY",arguments.toString())
//
//        }

    }


    override fun onSupportNavigateUp(): Boolean {
        var controller: NavController = findNavController(R.id.nav_host_fragment)
        return controller.navigateUp() || super.onSupportNavigateUp()
    }


}