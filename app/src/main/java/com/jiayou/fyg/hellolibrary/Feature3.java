package com.jiayou.fyg.hellolibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jiayou.fyg.jiuxiantoollib.JiuxianUtil;

import cn.trinea.android.common.util.ToastUtils;


public class Feature3 extends AppCompatActivity implements View.OnClickListener {

    private Button feature_3_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feature3_activity);

        feature_3_btn = (Button) findViewById(R.id.feature_3_btn);
        feature_3_btn.setOnClickListener(this);

        JiuxianUtil.getAppName();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case  R.id.feature_3_btn:

                ToastUtils.show(this, " feature 3 界面  ，我是功能 3  按钮 ");

            break;

        }
    }

}
