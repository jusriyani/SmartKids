package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DesPisang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des_pisang);
    }
    public void backPisang(View view ){
        Intent myIntent = new Intent(this,Buah.class);
        startActivity(myIntent);
    }
}