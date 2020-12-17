package com.jetpackviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

   private NewsViewModel newsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        newsViewModel = new NewsViewModel();
        newsViewModel.itemNewsLiveData.observe(this, new Observer<List<ItemNews>>() {
            @Override
            public void onChanged(List<ItemNews> itemNews) {

            }
        });






    }
}