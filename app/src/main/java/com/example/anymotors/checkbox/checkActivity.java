package com.example.anymotors.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.anymotors.MainActivity;
import com.example.anymotors.R;

import java.util.ArrayList;

public class checkActivity extends AppCompatActivity {
      CheckBox chk_c,chk_cpp,chk_java;
      ArrayList al=new ArrayList();
      Button btnsend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        chk_c = findViewById(R.id.chk_c);
        chk_cpp = findViewById(R.id.chk_cpp);
        chk_java = findViewById(R.id.chk_java);
        btnsend = findViewById(R.id.btnsend);

        chk_c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
              if (b)
              {
                  al.add("c language");
              }
              else
              {
                  al.remove("c language");
              }
            }
        });

        chk_cpp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
              if (b)
              {
                  al.add("c++");
              }
              else
              {
                  al.remove("c++");
              }
            }
        });

        chk_java.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                if (b)
                {
                    al.add("java");
                }
                else
                {
                    al.remove("java");
                }
            }
        });

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.d("mydata","--->"+al);
            }
        });
    }
}