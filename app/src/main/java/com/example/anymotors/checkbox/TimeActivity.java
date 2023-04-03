package com.example.anymotors.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import com.example.anymotors.R;

import java.util.Calendar;

public class TimeActivity extends AppCompatActivity {

    Button btntime;
    Calendar calender = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time2);
        btntime = findViewById(R.id.btntime);

        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new  TimePickerDialog(TimeActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        btntime.setText(i+":"+i1);
                    }
                }, calender.get(Calendar.HOUR), calender.get(Calendar.MINUTE), true)
                        .show();
            }
        });
    }
}