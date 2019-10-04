package com.praktikum.sisforupa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; //harusnya button
import android.widget.LinearLayout; //karena Menu-nya dibungkus Linier layout maka saya pakai Linier Layout saja

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                  // function panggilanDarurat
                 //function_Maps dan function_Call (Biar mudah)
        LinearLayout btn_maps = findViewById(R.id.btn_maps);
        btn_maps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                function_Maps(v);
            }
        });
        LinearLayout btn_Telepon = findViewById(R.id.btn_Telepon);
        btn_Telepon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                fanction_Telepon(v);
            }
        });

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
    public void fanction_Telepon(View view){
        Uri uri = Uri.parse("tel:082250022913");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }
    public void function_Maps(View view){
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=-0.056777,109.344883");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
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
