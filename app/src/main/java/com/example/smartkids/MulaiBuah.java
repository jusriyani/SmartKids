package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MulaiBuah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_buah);
    }
    public void mulaiBuah(View view ){
        Intent myIntent = new Intent(this,Huruf.class);
        startActivity(myIntent);
    }
    public void backBuah(View view ){
        Intent myIntent = new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}