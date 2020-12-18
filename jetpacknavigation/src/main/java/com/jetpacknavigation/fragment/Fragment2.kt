package com.jetpacknavigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.jetpacknavigation.R


class Fragment2 : Fragment() {

    private var button: Button? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_2, container, false)
        button = view.findViewById(R.id.btn_back)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        button?.setOnClickListener(View.OnClickListener {
            it.findNavController().popBackStack() //将Fragment 弹出栈操作

//            it.findNavController().navigate(R.id.fragment1) //是不断的想栈里面添加fragment1 实例

        })

    }


}