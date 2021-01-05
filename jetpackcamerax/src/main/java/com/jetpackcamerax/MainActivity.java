package com.jetpackcamerax;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.camera.CameraActivity;

public class MainActivity extends AppCompatActivity {


    private ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cameraPhoto();
            }
        });


        findViewById(R.id.btn_galley).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlbumShowActivity.class);
                startActivity(intent);
            }
        });


        iv = findViewById(R.id.iv);


    }


    private void cameraPhoto() {

        Intent intent = new Intent(MainActivity.this, CameraActivity.class);

        startActivityForResult(intent, 100);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 100:

                if (resultCode == RESULT_OK) {
                    String path = data.getStringExtra("path");

                    //file:///storage/emulated/0/Android/media/com.example.cameraxapp/Camera/2020-12-31-17-19-21-184.jpg


                    iv.setImageURI(Uri.parse(path));


                }


                break;
        }
    }


}