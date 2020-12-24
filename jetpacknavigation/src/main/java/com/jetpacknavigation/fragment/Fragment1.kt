package com.jetpacknavigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.jetpacknavigation.R


class Fragment1 : Fragment() {

    var button: Button? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_1, container, false)
        button = view.findViewById(R.id.button)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button?.setOnClickListener(View.OnClickListener {

            var bundle = Bundle()
            bundle.putString("name","jack")

            val controller = it.findNavController()
            controller.navigate(R.id.action_fragment1_to_fragment2,bundle)
        })
    }


}