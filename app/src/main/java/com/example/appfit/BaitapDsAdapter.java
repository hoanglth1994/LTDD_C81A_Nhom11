package com.example.appfit;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.example.appfit.R;

public class BaitapDsAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] tenbt;
    private final String[] noidungbt;
    private final Integer[] imgbt;

    public BaitapDsAdapter(Activity context,String[] maintitle,String[] subtitle,Integer[] imgid)
    {
        super(context, R.layout.baitap, maintitle);
        this.context = context;
        this.tenbt = maintitle;
        this.noidungbt = subtitle;
        this.imgbt = imgid;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View row = inflater.inflate(R.layout.baitap, null, true);
        TextView title = (TextView) row.findViewById(R.id.baitap_ten);
        TextView sub_title = (TextView) row.findViewById(R.id.baitap_noidung);
        ImageView img = (ImageView) row.findViewById(R.id.imgbaitap);

        title.setText(tenbt[position]);
        sub_title.setText(noidungbt[position]);
        img.setImageResource(imgbt[position]);
        return row;
    }
}
