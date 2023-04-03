package com.example.anymotors.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.anymotors.R;

public class colorActivity extends AppCompatActivity {

    RadioGroup rg_clr;
    LinearLayout lll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        rg_clr = findViewById(R.id.rg_clr);
        lll = findViewById(R.id.lll);

        rg_clr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i)
            {
             if (i==R.id.rb_red)
             {
                lll.setBackgroundColor(Color.RED);
             }
             else if (i==R.id.rb_blue)
             {
                lll.setBackgroundColor(Color.BLUE);
             }
             else
                {
                   lll.setBackgroundColor(Color.GREEN);
                }
            }
        });

    }
}