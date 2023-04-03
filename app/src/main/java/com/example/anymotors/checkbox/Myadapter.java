package com.example.anymotors.checkbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anymotors.R;

import java.util.ArrayList;


public class Myadapter extends BaseAdapter
{


    Context context;
    ArrayList<GetterSetter>al;

    public Myadapter(Context context, ArrayList<GetterSetter> al)
    {
     this.context = context;
     this.al = al;

   }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int i) {
        return al.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=layoutInflater.inflate(R.layout.myrow,null);

        ImageView im;
        TextView tv;

        im = v.findViewById(R.id.imview);
        tv = v.findViewById(R.id.tvview);

        GetterSetter gl=al.get(i);
        im.setImageResource(gl.getImg());
        tv.setText(gl.getTitle());

        return v;
    }
}
