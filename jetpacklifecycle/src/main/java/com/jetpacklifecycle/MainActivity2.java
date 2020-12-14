package com.jetpacklifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 页面开始时添加生命周期的监听，页面销毁时，去除生命周期的监听
 */
public class MainActivity2 extends AppCompatActivity {

    private LifecycleObserverImpl observer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        observer = new LifecycleObserverImpl();
        getLifecycle().addObserver(observer);


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        getLifecycle().removeObserver(observer);
    }
}