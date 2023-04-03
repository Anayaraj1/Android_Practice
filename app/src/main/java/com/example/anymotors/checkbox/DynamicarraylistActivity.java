package com.example.anymotors.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.anymotors.R;

import java.util.ArrayList;

public class DynamicarraylistActivity extends AppCompatActivity {

    EditText eddata;
    ListView lvdata;
    Button btn;

    ArrayList<String> product_list = new ArrayList<>();
    ArrayAdapter adapter;
    String product;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamicarraylist);

        lvdata = findViewById(R.id.lvdynamic);
        eddata = findViewById(R.id.eddata);
        btn = findViewById(R.id.btnpro);
        adapter = new ArrayAdapter(DynamicarraylistActivity.this, android.R.layout.simple_list_item_1);
        lvdata.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                product = eddata.getText().toString();
                eddata.getText().clear();
                product_list.add(product);


            }
        });

    }
}