package com.example.smartkids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public CardView cardHuruf, cardAngka, cardHewan, cardBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardHuruf = (CardView) findViewById(R.id.card_huruf);
        cardAngka = (CardView) findViewById(R.id.card_angka);
        cardHewan = (CardView) findViewById(R.id.card_hewan);
        cardBuah = (CardView) findViewById(R.id.card_buah);

        cardHuruf.setOnClickListener(this);
        cardAngka.setOnClickListener(this);
        cardHewan.setOnClickListener(this);
        cardBuah.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.card_huruf :
                i = new Intent(this, MulaiHuruf.class);
                startActivity(i);
                break;

            case R.id.card_angka :
                i = new Intent(this, MulaiAngka.class);
                startActivity(i);
                break;

            case R.id.card_hewan :
                i = new Intent(this, MulaiHewan.class);
                startActivity(i);
                break;

            case R.id.card_buah :
                i = new Intent(this, MulaiBuah.class);
                startActivity(i);
                break;
        }
    }
}