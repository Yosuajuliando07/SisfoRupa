package com.praktikum.sisforupa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simulasi_nilai(View view) {
        Intent intent = new Intent(MainActivity.this, Simulasi_nilai.class);
        startActivity(intent);
    }
    public void cuaca(View view) {
        Intent intent = new Intent(MainActivity.this, Cuaca.class);
        startActivity(intent);
    }
    public void nilai(View view) {
        Intent intent = new Intent(MainActivity.this, Nilai.class);
        startActivity(intent);
    }
    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, Profil.class);
        startActivity(intent);
    }
    public void ikon_1(View view) {
        Intent intent = new Intent(MainActivity.this, Ikon_1.class);
        startActivity(intent);
    }
    public void ikon_2(View view) {
        Intent intent = new Intent(MainActivity.this, Ikon_2.class);
        startActivity(intent);
    }
    public void saran(View view) {
        Intent intent = new Intent(MainActivity.this, Saran.class);
        startActivity(intent);
    }
    public void tentang(View view) {
        Intent intent = new Intent(MainActivity.this, Tentang.class);
        startActivity(intent);
    }
}
