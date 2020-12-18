package com.databinding.demo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @Copyright:      Copyright (c) 常州好开心网络科技有限公司.All rights reserved.
 * @ClassName:      DemoViewModel
 * @Description:
 * @CreateDate:     2020/12/18 上午9:50
 */
class DemoViewModel : ViewModel() {

    val liveDataUser = MutableLiveData<DemoUser>()

    fun agePlus() {
        var value = liveDataUser.value
        if (null == value) {
            val user = DemoUser()
            user.age = 0
            user.name = "zz"
            user.avator = ""
        }

        value?.age = value?.age?.plus(1)!!
        liveDataUser.postValue(value)


    }


}