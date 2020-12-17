package com.jetpacklivedatakotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @Copyright:      Copyright (c) 常州好开心网络科技有限公司.All rights reserved.
 * @ClassName:      MainViewModel
 * @Description:
 * @CreateDate:     2020/12/17 上午10:35
 */
class MainViewModel : ViewModel() {

    val liveDataI = MutableLiveData<Int>()
    var stop = false

    fun start() {
        liveDataI.postValue(0)
        object : Thread() {
            override fun run() {
                super.run()
                while (!stop) {
                    Thread.sleep(3000)
                    var value = liveDataI.value
                    if (value != null) {
                        liveDataI.postValue(value + 2)
                    }
                }
            }
        }.start()
    }


    fun stop() {
        stop = true
    }


}