package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DesSinga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des_singa);
    }
    public void backSinga(View view ){
        Intent myIntent = new Intent(this,Hewan.class);
        startActivity(myIntent);
    }
}