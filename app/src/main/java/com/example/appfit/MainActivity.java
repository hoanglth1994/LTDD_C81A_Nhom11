package com.example.appfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private TextView tvClick;

    private EditText editCC;
    private EditText editCN;
    private TextView txtKQ;
    private TextView tvTapLuyen;
    private TextView tvHoSo;
    private TextView tvLienHe;




    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding


        editCC = findViewById(R.id.editChieuCao);
        editCN = findViewById(R.id.editCanNang);
        txtKQ = findViewById(R.id.textKQ);

        tvLienHe = findViewById(R.id.textBTlienhe);
        tvHoSo = findViewById(R.id.textBThoso);
        tvTapLuyen = findViewById(R.id.textBTtapluyen);

        imageView = findViewById(R.id.imgProfile);

        //============= dung thu vien picaso add hinh bang link or
        Picasso.get()
                .load("https://img.freepik.com/free-vector/stronger-than-your-excuses_5435-313.jpg?size=338&ext=jpg")
                .resize(200, 200)
                .centerCrop()
                .into(imageView);

        // ==== event cick

        txtKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueCC = editCC.getText().toString();
                String valueCN = editCN.getText().toString();
                double a = Double.parseDouble(valueCC);
                double b = Double.parseDouble(valueCN);
                double ketqua = (b / (a * a)) * 10000;

                if (ketqua < 18)
                {
                    Toast.makeText(getApplicationContext(),String.valueOf("Bạn có thân hình hơi gầy"),Toast.LENGTH_LONG).show();// gay
                }
                else if (ketqua <= 24.9)
                {
                    Toast.makeText(getApplicationContext(),String.valueOf("Bạn có thân hình bình thường"),Toast.LENGTH_LONG).show();;//Bạn là người bình thường
                }
                else if (ketqua <= 29.9)
                {
                    Toast.makeText(getApplicationContext(),String.valueOf("Bạn bị béo phì độ I"),Toast.LENGTH_LONG).show();; //Bạn bị béo phì độ I
                }
                else if (ketqua <= 34.9)
                {
                    Toast.makeText(getApplicationContext(),String.valueOf("Bạn bị béo phì độ II"),Toast.LENGTH_LONG).show();; //Bạn bị béo phì độ II
                }
                else
                {
                    Toast.makeText(getApplicationContext(),String.valueOf("Bạn bị béo phì độ III"),Toast.LENGTH_LONG).show();;//Bạn bị béo phì độ III
                }

            }
        });


        tvLienHe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hồ Sơ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,LienHe.class);
                startActivity(intent);
            }
        });

        tvHoSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hồ Sơ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Hoso.class);
                startActivity(intent);
            }
        });

        tvTapLuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Tập Luyện",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,GiaoDienBT.class);
                startActivity(intent);

            }
        });




    }




}
