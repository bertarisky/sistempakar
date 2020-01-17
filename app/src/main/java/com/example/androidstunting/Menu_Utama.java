package com.example.androidstunting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Utama extends AppCompatActivity {

    Button btn_tentang,btn_test,btn_saran;
    //btnLayarSatu = layar Tentang
    //btnLayarSatu = layar Cek
    //btnLayarSatu = layar Saran

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        btn_tentang = findViewById(R.id.tentang);
        btn_test = findViewById(R.id.test);
        btn_saran = findViewById(R.id.saran);

        btn_tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tentang = new Intent(Menu_Utama.this, Menu_Layar_Satu.class);
                startActivity(tentang);
            }
        });
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent(Menu_Utama.this, Menu_Layar_Dua.class);
                startActivity(test);
            }
        });
        btn_saran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saran = new Intent(Menu_Utama.this, Menu_Layar_Tiga.class);
                startActivity(saran);
            }
        });
    }}