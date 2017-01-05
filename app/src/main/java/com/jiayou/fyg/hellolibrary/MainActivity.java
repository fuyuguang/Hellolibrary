package com.jiayou.fyg.hellolibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jiayou.fyg.jiuxiantoollib.JiuxianUtil;

import cn.trinea.android.common.util.ToastUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button feature_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        JiuxianUtil.getAppName();

        feature_2 = (Button) findViewById(R.id.feature_2);
        feature_2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.feature_2:

                ToastUtils.show(this," 我是 feature 2 ");
                break;
        }
    }
}
