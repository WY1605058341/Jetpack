package com.jetpacklifecycle;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

/**
 * @Copyright: Copyright (c) 常州好开心网络科技有限公司.All rights reserved.
 * @ClassName: App
 * @Description:
 * @CreateDate: 2020/12/14 上午10:01
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationObserver());
    }
}
