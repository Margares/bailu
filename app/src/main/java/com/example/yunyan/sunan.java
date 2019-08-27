package com.example.yunyan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class sunan extends AppCompatActivity {

    private TextView mTextMessage;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.chart:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.menu:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.home:
                    Intent i=new Intent(sunan.this,homeq.class);
                    startActivity(i);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunan);
        getWindow().setBackgroundDrawableResource(R.mipmap.background);
        PathView pv=(PathView)findViewById(R.id.pv);
//        pv.setBackgroundColor(Color.parseColor("#000000"));

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setItemIconTintList(null);
        //设置图标颜色为原颜色
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }



}


