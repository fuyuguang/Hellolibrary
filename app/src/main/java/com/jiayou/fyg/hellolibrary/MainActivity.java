package com.jiayou.fyg.hellolibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jiayou.fyg.jiuxiantoollib.JiuxianUtil;

import cn.trinea.android.common.util.ToastUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button feature_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        JiuxianUtil.getAppName();


        feature_1 = (Button) findViewById(R.id.feature_1);
        feature_1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case  R.id.feature_1:

                ToastUtils.show(this, "我是功能 1 按钮 ");

            break;


        }
    }
}
