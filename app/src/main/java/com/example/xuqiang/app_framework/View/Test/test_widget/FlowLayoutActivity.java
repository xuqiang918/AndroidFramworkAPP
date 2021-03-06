package com.example.xuqiang.app_framework.View.Test.test_widget;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.libcore.utils.CommonUtils;
import com.example.libcore_ui.activity.BaseActivity;
import com.example.libcore_ui.widget.FlowLayout;
import com.example.xuqiang.app_framework.R;

/**
 * Description 测试流式布局
 * Created by xuqiang on 2018/1/9 0009.
 */

public class FlowLayoutActivity extends BaseActivity{
    int orientation = FlowLayout.HORIZONTAL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_flow);
        findViewById(R.id.btn_change_orientation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orientation = 1 - orientation;
                if (orientation == FlowLayout.HORIZONTAL) {
                    findViewById(R.id.sv_content).setVisibility(View.VISIBLE);
                    findViewById(R.id.hsv_content).setVisibility(View.GONE);
                } else {
                    findViewById(R.id.sv_content).setVisibility(View.GONE);
                    findViewById(R.id.hsv_content).setVisibility(View.VISIBLE);
                }
            }
        });
        for (int i=0; i<500; i++){
            TextView view = new TextView(this);
            view.setTextColor(ContextCompat.getColor(this, R.color.black));
            view.setTextSize(20);
            if (i%2==0){
                view.setBackgroundColor(ContextCompat.getColor(this, R.color.darkorchid));
            }else{
                view.setBackgroundColor(ContextCompat.getColor(this, R.color.palegreen));
            }
            int width = (int) (CommonUtils.dp2px(30) + Math.random()*300);
            int height = (int) (CommonUtils.dp2px(30) + Math.random()*300);
            view.setText(CommonUtils.px2dp(width) + "dp+"+CommonUtils.px2dp(height)+"dp");
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(width, height);
            view.setLayoutParams(lp);
            ((FlowLayout) findViewById(R.id.fl_horizontal)).addView(view);
        }
        for (int i=0; i<500; i++){
            TextView view = new TextView(this);
            view.setTextColor(ContextCompat.getColor(this, R.color.black));
            view.setTextSize(20);
            if (i%2==0){
                view.setBackgroundColor(ContextCompat.getColor(this, R.color.darkorchid));
            }else{
                view.setBackgroundColor(ContextCompat.getColor(this, R.color.palegreen));
            }
            int width = (int) (CommonUtils.dp2px(30) + Math.random()*300);
            int height = (int) (CommonUtils.dp2px(30) + Math.random()*300);
            view.setText(CommonUtils.px2dp(width) + "dp+"+CommonUtils.px2dp(height)+"dp");
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(width, height);
            view.setLayoutParams(lp);
            ((FlowLayout) findViewById(R.id.fl_vertical)).addView(view);
        }
    }
}
