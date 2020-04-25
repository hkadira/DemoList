package com.example.democontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Initialize list view
    private ListView list;
    //list view data
    String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adding list view
        list = (ListView) findViewById(R.id.listview);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, week);
        list.setAdapter(adapter);
    }
}
