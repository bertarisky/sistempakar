package com.example.androidstunting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Menu_Layar_Satu extends AppCompatActivity {

    TextView tvNamaSatu, tvNamaDua;

    //tvNamaSatu = Judul
    //tvNamaDua = Materi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layar_satu);

    }
}
