package com.databinding.two

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import com.databinding.BR

/**
 * @Copyright:      Copyright (c) 常州好开心网络科技有限公司.All rights reserved.
 * @ClassName:      OneWayUser
 * @Description:
 * @CreateDate:     2020/12/17 下午4:11
 */
class TwoWayUser : BaseObservable() {

//    @Bindable
//    var age: Int = 0
//        set(value) {
//            field = value
//            notifyPropertyChanged(BR.age)
//        }
//
//    @Bindable
//    var name: String = ""
//        set(value) {
//            field = value
//            notifyPropertyChanged(BR.name)
//        }


    var age: ObservableField<Int> = ObservableField(0)
    var name: ObservableField<String> = ObservableField("")


}