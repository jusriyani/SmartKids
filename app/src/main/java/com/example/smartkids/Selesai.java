package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Selesai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai);
    }
    public void backBeranda(View view ){
        Intent myIntent = new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}