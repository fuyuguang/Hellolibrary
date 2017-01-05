package com.jiayou.fyg.hellolibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jiayou.fyg.jiuxiantoollib.JiuxianUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        

        JiuxianUtil.getAppName();

    }
}
