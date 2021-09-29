package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MulaiHewan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_hewan);
    }

    public void mulaiHewan(View view ){
        Intent myIntent = new Intent(this,Huruf.class);
        startActivity(myIntent);
    }
    public void backHewan(View view ){
        Intent myIntent = new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}