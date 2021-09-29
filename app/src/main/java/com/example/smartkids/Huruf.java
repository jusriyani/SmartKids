package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Huruf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);
    }

    public void backHuruf(View view ){
        Intent myIntent = new Intent(this,MulaiHuruf.class);
        startActivity(myIntent);
    }
}