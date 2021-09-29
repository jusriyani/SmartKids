package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hewan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);
    }
    public void backHewan(View view ){
        Intent myIntent = new Intent(this,MulaiHewan.class);
        startActivity(myIntent);
    }
    public void hewan_selesai(View view ){
        Intent myIntent = new Intent(this,Selesai.class);
        startActivity(myIntent);
    }
    public void desAyam(View view ){
        Intent myIntent = new Intent(this,DesAyam.class);
        startActivity(myIntent);
    }
    public void desBebek(View view ){
        Intent myIntent = new Intent(this,DesBebek.class);
        startActivity(myIntent);
    }
    public void desBeruang(View view ){
        Intent myIntent = new Intent(this,DesBeruang.class);
        startActivity(myIntent);
    }
    public void desBuaya(View view ){
        Intent myIntent = new Intent(this,DesBuaya.class);
        startActivity(myIntent);
    }
    public void desKelinci(View view ){
        Intent myIntent = new Intent(this,DesKelinci.class);
        startActivity(myIntent);
    }
    public void desKuda(View view ){
        Intent myIntent = new Intent(this,DesKuda.class);
        startActivity(myIntent);
    }
    public void desSapi(View view ){
        Intent myIntent = new Intent(this,DesSapi.class);
        startActivity(myIntent);
    }
    public void desSinga(View view ){
        Intent myIntent = new Intent(this,DesSinga.class);
        startActivity(myIntent);
    }
}