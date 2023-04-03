package com.example.anymotors.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.anymotors.R;

public class AlertActivity extends AppCompatActivity {
          Button btnalert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnalert =  findViewById(R.id.btn_alert);

        btnalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(AlertActivity.this)
                        .setTitle("Alert")
                        .setMessage("Are you sure you want to close this app?")
                        .setCancelable(false)
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(AlertActivity.this, "yes", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                                finish();
                            }
                        })
                        .setNegativeButton("no", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(AlertActivity.this, "No", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();

                            }
                        })
                        .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(AlertActivity.this, "cancel", Toast.LENGTH_SHORT).show();
                                dialogInterface.cancel();
                            }
                        })
                        .show();

            }
        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        new AlertDialog.Builder(AlertActivity.this)
                .setTitle("Alert")
                .setMessage("Are you sure you want to close this app?")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "yes", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                        finish();
                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "No", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();

                    }
                })
                .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "cancel", Toast.LENGTH_SHORT).show();
                        dialogInterface.cancel();
                    }
                })
                .show();
    }
}

