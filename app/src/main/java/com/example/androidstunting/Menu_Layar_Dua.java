package com.example.androidstunting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class Menu_Layar_Dua extends AppCompatActivity {


    CheckBox chckTinggi,
            chckPorsi,
            chckBerat,
            chckGizi,
            chckAsieksklusif,
            chckNafsu,
            chckSakit,
            chckCacingan;

    Button btnProses;

    TextView tvKesimpulan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layar_dua);

        chckTinggi          = (CheckBox)findViewById(R.id.tinggi);
        chckPorsi           = (CheckBox)findViewById(R.id.porsi);
        chckBerat           = (CheckBox)findViewById(R.id.berat);
        chckGizi            = (CheckBox)findViewById(R.id.gizi);
        chckAsieksklusif    = (CheckBox)findViewById(R.id.asi);
        chckNafsu           = (CheckBox)findViewById(R.id.nafsu);
        chckSakit           = (CheckBox)findViewById(R.id.sakit);
        chckCacingan        = (CheckBox)findViewById(R.id.cacing);

        btnProses = (Button)findViewById(R.id.proses);
        tvKesimpulan = (TextView)findViewById(R.id.simpulan);

        tvKesimpulan.setText("");   // kosongkan textview atau nama penyakit saat membuka sistem pakar

        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kesimpulan = new Intent (Menu_Layar_Dua.this, Kesimpulan.class);
                startActivity(kesimpulan);

                String NamaPenyakit = "";                   //String NamaPenyakit = "Anda Menderita Penyakit : ";

                tvKesimpulan.setText("" + NamaPenyakit);

                //jenis gejala untuk balita stunting
                if (chckTinggi.isChecked() && chckPorsi.isChecked() && chckBerat.isChecked() && chckAsieksklusif.isChecked() && chckNafsu.isChecked() && chckSakit.isChecked()) {
                    NamaPenyakit += "\nMasih ada waktu untuk mengejar kekurangan pada tinggi anak anda. Segera penuhi kecukupan nutrisinya";
                }
                if (chckTinggi.isChecked() && chckPorsi.isChecked() && chckBerat.isChecked() ) {
                    NamaPenyakit += "\nMasih ada waktu untuk mengejar kekurangan pada tinggi anak anda. Segera penuhi kecukupan nutrisinya";
                }
                if (chckGizi.isChecked() && chckAsieksklusif.isChecked() && chckNafsu.isChecked() && chckSakit.isChecked()) {
                    NamaPenyakit += "\nSegera konsultasi ke tenaga kesehatan untuk mengetahui kondisi anak anda saat ini";
                }

                //Tampilkan hasil nama penyakit di textview
                tvKesimpulan.setText("" + NamaPenyakit);
            }});
}}