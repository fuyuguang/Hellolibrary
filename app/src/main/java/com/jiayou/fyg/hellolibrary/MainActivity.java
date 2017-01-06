package com.jiayou.fyg.hellolibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jiayou.fyg.jiuxiantoollib.JiuxianUtil;

import cn.trinea.android.common.util.ToastUtils;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button feature_1;

    private Button feature_2;

    private Button feature_3;
    private Button feature_4;
    private Button feature_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        feature_3 = (Button) findViewById(R.id.feature_3);
        feature_3.setOnClickListener(this);
        feature_4 = (Button) findViewById(R.id.feature_4);
        feature_4.setOnClickListener(this);

        JiuxianUtil.getAppName();


        //TODO 添加 feature 9 的功能

        //TODO 添加 feature 10 的功能


        //TODO 添加 feature 11 的功能

        //TODO 添加 feature 12 的功能

        //TODO 添加 feature 13 的功能


        feature_1 = (Button) findViewById(R.id.feature_1);
        feature_1.setOnClickListener(this);
        feature_2 = (Button) findViewById(R.id.feature_2);
        feature_2.setOnClickListener(this);

        feature_5 = (Button) findViewById(R.id.feature_5);
        feature_5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case  R.id.feature_1:

                ToastUtils.show(this, "我是功能 1 按钮 ");

                startActivity(new Intent(this,Feature1.class));
            break;


            case R.id.feature_2:

                ToastUtils.show(this," 我是 feature 2 ");
                startActivity(new Intent(this,Feature2.class));
                break;

            case R.id.feature_3:

                ToastUtils.show(this," 我是 feature 3");

                startActivity(new Intent(this,Feature3.class));
                break;

            case R.id.feature_4:

                ToastUtils.show(this," 我是 feature 4");

                startActivity(new Intent(this,Feature4.class));
                break;

            case R.id.feature_5:

                ToastUtils.show(this," 我是 feature 5");

                break;



        }
    }

}
