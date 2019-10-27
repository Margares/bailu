package com.example.yunyan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class homeq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeq);

        ListView lv1=(ListView)findViewById(R.id.homelv);
        List<String>listdata=new ArrayList<String>();
        ArrayAdapter<String>aa=new ArrayAdapter<String>(this,R.layout.list_item,listdata);
        lv1.setAdapter(aa);

    }
}
