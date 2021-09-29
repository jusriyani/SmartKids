package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DesSapi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des_sapi);
    }
    public void backSapi(View view ){
        Intent myIntent = new Intent(this,Hewan.class);
        startActivity(myIntent);
    }
}