package com.testapp.krish.week1day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {

    static CustomListActivity customList;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        customList = this;

        lv = (ListView) findViewById(R.id.custom_list_view);
        lv.setAdapter((ListAdapter) new CustomAdapter());
    }
}
