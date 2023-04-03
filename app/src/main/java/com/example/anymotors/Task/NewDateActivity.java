package com.example.anymotors.Task;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.anymotors.R;

import org.w3c.dom.Text;

import java.util.Calendar;

public class NewDateActivity extends AppCompatActivity {

    Button btnnew;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_date);
        Calendar calendar = Calendar.getInstance();

        btnnew = findViewById(R.id.btnnew);

        btnnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog db = new DatePickerDialog(NewDateActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        String kk ="Booking is on" +  i1 + "-"+(i1+1)+"-"+i;
                        TextView tv = findViewById(R.id.tvnew);
                        tv.setText(kk);
                    }
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));

                    db.getDatePicker().setMaxDate(System.currentTimeMillis());
                    db.show();
            }
        });
    }
}