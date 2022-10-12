package com.example.luckgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    List<String> cardValues, cardsColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        cardValues = new ArrayList<>();
        cardsColors = new ArrayList<>();

        cardValues.add("2");
        cardValues.add("3");
        cardValues.add("4");
        cardValues.add("5");
        cardValues.add("6");
        cardValues.add("7");
        cardValues.add("8");
        cardValues.add("9");
        cardValues.add("10");
        cardValues.add("J");
        cardValues.add("Q");
        cardValues.add("K");
        cardValues.add("A");

        cardsColors.add("clubs");
        cardsColors.add("diamonds");
        cardsColors.add("heart");
        cardsColors.add("spades");

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Random r = new Random();
                String randomValue = cardValues.get(r.nextInt(cardValues.size()));
                String randomColor = cardsColors.get(r.nextInt(cardsColors.size()));

                textView.setText(randomValue + " of " + randomColor);

            }
        });

    }
}