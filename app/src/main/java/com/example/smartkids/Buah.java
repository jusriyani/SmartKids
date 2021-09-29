package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Buah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);
    }
    public void backBuah(View view ){
        Intent myIntent = new Intent(this,MulaiBuah.class);
        startActivity(myIntent);
    }
    public void buah_selesai(View view ){
        Intent myIntent = new Intent(this,Selesai.class);
        startActivity(myIntent);
    }
    public void desAnggur(View view ){
        Intent myIntent = new Intent(this,DesAnggur.class);
        startActivity(myIntent);
    }
    public void desKiwi(View view ){
        Intent myIntent = new Intent(this,DesKiwi.class);
        startActivity(myIntent);
    }
    public void desLemon(View view ){
        Intent myIntent = new Intent(this,DesLemon.class);
        startActivity(myIntent);
    }
    public void desNanas(View view ){
        Intent myIntent = new Intent(this,DesNanas.class);
        startActivity(myIntent);
    }
    public void desPir(View view ){
        Intent myIntent = new Intent(this,DesPir.class);
        startActivity(myIntent);
    }
    public void desPisang(View view ){
        Intent myIntent = new Intent(this,DesPisang.class);
        startActivity(myIntent);
    }
    public void desSemangka(View view ){
        Intent myIntent = new Intent(this,DesSemangka.class);
        startActivity(myIntent);
    }
    public void desStroberi(View view ){
        Intent myIntent = new Intent(this,DesStroberi.class);
        startActivity(myIntent);
    }
}