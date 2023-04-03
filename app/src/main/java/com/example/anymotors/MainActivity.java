package com.example.anymotors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anymotors.Menus.ProfileActivity;

public class MainActivity extends AppCompatActivity {

 Button btn;
 TextView tvdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn_click);
        tvdata = findViewById(R.id.tv_data);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu pm = new PopupMenu(MainActivity.this,btn);

                pm.getMenuInflater().inflate(R.menu.mymenu,pm.getMenu());
                pm.show();

                pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem)
                    {
                        if (menuItem.getItemId()==R.id.op_Logout)
                        {
                            Toast.makeText(MainActivity.this, "Popup menu Profile", Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });
            }
        });
        registerForContextMenu(tvdata);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.op_profile:
                Toast.makeText(this,"Profile search",Toast.LENGTH_SHORT).show();
                break;

            case R.id.op_Logout:
                Toast.makeText(this, "Logout Search", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}