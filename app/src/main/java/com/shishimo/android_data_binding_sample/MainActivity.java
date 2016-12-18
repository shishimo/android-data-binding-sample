package com.shishimo.android_data_binding_sample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shishimo.android_data_binding_sample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Bind オブジェクトを取得する。
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Bindするデータを作成
        User taro = new User("taro", 25);

        // Bind
        binding.setUser(taro);
    }
}
