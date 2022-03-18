package com.example.a2ndtensorlection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Card firstCard = new Card("Diamonds", 1);
        //вывод название карты на экран
        TextView cardText = findViewById(R.id.textCard);
        cardText.setText(firstCard.suit + " " + firstCard.rank);


    }

}

