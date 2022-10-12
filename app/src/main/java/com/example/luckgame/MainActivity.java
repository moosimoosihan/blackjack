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
    TextView textView1;
    TextView textView2;
    TextView textView3;
    List<String> cardValues, cardsColors;
    List<Integer> num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        cardValues = new ArrayList<>();
        cardsColors = new ArrayList<>();
        num = new ArrayList<>();

        cardValues.add("A");
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

        cardsColors.add("클로버");
        cardsColors.add("다이아몬드");
        cardsColors.add("하트");
        cardsColors.add("스페이드");

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Random r1 = new Random();
                int num1 = num.get(r1.nextInt(num.size()));
                String randomValue1 = cardValues.get(num1-1);
                String randomColor1 = cardsColors.get(r1.nextInt(cardsColors.size()));


                Random r2 = new Random();
                int num2 = num.get(r1.nextInt(num.size()));
                String randomValue2 = cardValues.get(num2-1);
                String randomColor2 = cardsColors.get(r2.nextInt(cardsColors.size()));



                textView1.setText(randomValue1 + " " + randomColor1);
                textView2.setText(randomValue2 + " " + randomColor2);
                if(num1+num2==21){
                    textView3.setText("카드 값의 합은 "+(num1+num2)+"\n축하합니다!!\n블랙잭 입니다.");
                } else {
                    textView3.setText("카드 값의 합은 "+(num1+num2)+"\n 아까워요 ㅠㅠ");
                }
            }
        });

    }
}