package com.hkx.databindingjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hkx.databindingjava.bean.FoUser;
import com.hkx.databindingjava.bean.ObUser;
import com.hkx.databindingjava.databinding.ActivityCommonUseBinding;

public class CommonUseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCommonUseBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_common_use);


        String name = "姓名是张三";
        binding.setName(name);

        String address = "Beijing 海淀";
        binding.setAddress(address);


        ObservableField obName = new ObservableField<String>("原始的obName");
        binding.setObName(obName);

        ObUser oUser = new ObUser();
        binding.setOUser(oUser);

        FoUser foUser = new FoUser();
        binding.setFUser(foUser);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CommonUseActivity.this, "1111", Toast.LENGTH_SHORT).show();
            }
        };
        binding.setClick(listener);


    }
}