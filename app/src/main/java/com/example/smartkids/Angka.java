package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Angka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);
    }
    public void backAngka(View view ){
        Intent myIntent = new Intent(this,MulaiAngka.class);
        startActivity(myIntent);
    }
    public void angka_selesai(View view ){
        Intent myIntent = new Intent(this,Selesai.class);
        startActivity(myIntent);
    }
}