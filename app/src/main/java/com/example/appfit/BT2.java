package com.example.appfit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class BT2 extends AppCompatActivity {

    private ListView listBt;
    String[] tenbt = {
            "baitap1","baitap2","baitap3","baitap4","baitap5",
    };

    String[] noidungbt = {
            "noidung1","noidung2","noidung3","noidung4","noidung5",
    };

    Integer[] imgbt={
            R.drawable.bt1_1,R.drawable.bt1_2,R.drawable.bt1_3,R.drawable.bt1_4,R.drawable.bt1_5,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_t2);


        //
        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Danh Sách Bài Tập");
        //
        BaitapDsAdapter adapter = new BaitapDsAdapter(this, tenbt,noidungbt,imgbt);
        listBt = (ListView) findViewById(R.id.listBT);
        listBt.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
