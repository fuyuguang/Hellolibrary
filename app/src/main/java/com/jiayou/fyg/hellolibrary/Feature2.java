package com.jiayou.fyg.hellolibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jiayou.fyg.jiuxiantoollib.JiuxianUtil;

import cn.trinea.android.common.util.ToastUtils;


public class Feature2 extends AppCompatActivity implements View.OnClickListener {

    private Button feature_2_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feature2_activity);

        feature_2_btn = (Button) findViewById(R.id.feature_2_btn);
        feature_2_btn.setOnClickListener(this);

        JiuxianUtil.getAppName();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case  R.id.feature_2_btn:

                ToastUtils.show(this, " feature 2 界面  ，我是功能 2 按钮 ");

            break;

        }
    }

}
