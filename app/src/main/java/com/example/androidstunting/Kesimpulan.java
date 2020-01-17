package com.example.androidstunting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Kesimpulan extends AppCompatActivity {
    String kesimpulanku;
    TextView simpulan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesimpulan);
        simpulan = findViewById(R.id.kesimpulan);

        Intent kesimpulan = getIntent();
        kesimpulanku = kesimpulan.getStringExtra("penyakit");

        simpulan.setText(kesimpulanku);
    }
}
