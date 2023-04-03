package com.example.anymotors.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.anymotors.MainActivity;
import com.example.anymotors.R;

import java.util.ArrayList;

public class IconicActivity extends AppCompatActivity {

  ListView lvdata;
  int img[]={R.mipmap.marshmeelo,R.mipmap.oreo,R.mipmap.lolipop};
  String title[]={"Lolipop","oreo","marshmrlo"};

  ArrayList<GetterSetter> al = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iconic);

        lvdata = findViewById(R.id.lvdata);

        for (int i =0;i<=img.length;i++){
            GetterSetter gl=new GetterSetter(img[i],title[i]);
            al.add(gl);
        }

        Myadapter myadapter= new Myadapter(IconicActivity.this,al);
        lvdata.setAdapter(myadapter);

    }
}