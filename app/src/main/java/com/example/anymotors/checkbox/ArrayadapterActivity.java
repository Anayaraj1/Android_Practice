package com.example.anymotors.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.anymotors.R;

import java.util.ArrayList;

public class ArrayadapterActivity extends AppCompatActivity {

    ListView lvdata;
    ArrayList al=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrayadapter);

        lvdata = findViewById(R.id.lvarray);

        al.add("c");
        al.add("java");
        al.add("Python");

        ArrayAdapter arrayAdapter = new ArrayAdapter(ArrayadapterActivity.this, android.R.layout.simple_list_item_1,al);
        lvdata.setAdapter(arrayAdapter);
    }
}