package com.example.appfit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class GiaoDienBT extends AppCompatActivity {

    private ImageView imgBT1;
    private ImageView imgBT2;
    private ImageView imgBT3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien_b_t);
        //


        //binding
        imgBT1 = findViewById(R.id.imgClick1);
        imgBT2 = findViewById(R.id.imgClick2);
        imgBT3 = findViewById(R.id.imgClick3);



        //event cick
        imgBT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GiaoDienBT.this,BT1.class);
                startActivity(intent);
            }
        });
        imgBT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GiaoDienBT.this,BT2.class);
                startActivity(intent);

            }
        });
        imgBT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GiaoDienBT.this,BT3.class);
                startActivity(intent);

            }
        });

    }


}
