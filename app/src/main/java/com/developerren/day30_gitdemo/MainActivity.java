package com.developerren.day30_gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //我是一个注释
    }

    private  long lastTime;
    @Override
    public void onBackPressed() {
        long ct= System.currentTimeMillis();
        if(ct-lastTime>2000){
            Toast.makeText(this,"再按返回键 退出",Toast.LENGTH_SHORT).show();;

        }else {
            super.onBackPressed();
        }

    }
}
