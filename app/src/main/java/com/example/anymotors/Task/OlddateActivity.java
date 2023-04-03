package com.example.anymotors.Task;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.anymotors.R;

import java.util.Calendar;

public class OlddateActivity extends AppCompatActivity {

    Button btnold;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olddate);
        Calendar calendar = Calendar.getInstance();

        btnold = findViewById(R.id.btnold);
        btnold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog db = new DatePickerDialog(OlddateActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                        String st= "Booking is on" + i1 + "-"+(i1+1)+"-"+i;
                        TextView tv = findViewById(R.id.tvold);
                        tv.setText(st);
                    }
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));

                  db.getDatePicker().setMinDate(System.currentTimeMillis());
                  db.show();
            }
        });

    }
}