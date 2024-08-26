package com.dotinstall.gokonseki;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FiveOnFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_on_five);

        String[] manArray = {"男性A","男性B","男性C","男性D","男性E"};
        String[] womanArray = {"女性A","女性B","女性C","女性D","女性E"};
        //while文で使う場合は初期化必要なし（for文では必要っぽい）
        int randomNum1m;
        int randomNum2m;
        int randomNum3m;
        int randomNum4m;
        int randomNum5m;

        int randomNum1w;
        int randomNum2w;
        int randomNum3w;
        int randomNum4w;
        int randomNum5w;

        Random rnd = new Random();

        randomNum1m = rnd.nextInt(5);
        final String seatM1name = manArray[randomNum1m];//男性席１決定

        randomNum2m = rnd.nextInt(5);
        while (randomNum2m == randomNum1m){
            randomNum2m = rnd.nextInt(5);//被らないように
        }
        final String seatM2name = manArray[randomNum2m];//男性席２決定

        randomNum3m = rnd.nextInt(5);
        while ((randomNum3m == randomNum1m)||(randomNum3m == randomNum2m)){
            randomNum3m = rnd.nextInt(5);
        }
        final String seatM3name = manArray[randomNum3m];//男性席３決定

        randomNum4m = rnd.nextInt(5);
        while ((randomNum4m == randomNum1m)||(randomNum4m == randomNum2m)||(randomNum4m == randomNum3m)){
            randomNum4m = rnd.nextInt(5);
        }
        final String seatM4name = manArray[randomNum4m];//男性席４決定

        randomNum5m = rnd.nextInt(5);
        while ((randomNum5m == randomNum1m)||(randomNum5m == randomNum2m)||(randomNum5m == randomNum3m)||(randomNum5m == randomNum4m)){
            randomNum5m = rnd.nextInt(5);
        }
        final String seatM5name = manArray[randomNum5m];//男性席5決定

        //女性席も決める
        randomNum1w = rnd.nextInt(5);
        final String seatW1name = womanArray[randomNum1w];//女性席１決定

        randomNum2w = rnd.nextInt(5);
        while (randomNum2w == randomNum1w){
            randomNum2w = rnd.nextInt(5);//被らないように
        }
        final String seatW2name = womanArray[randomNum2w];//女性席２決定

        randomNum3w = rnd.nextInt(5);
        while ((randomNum3w == randomNum1w)||(randomNum3w == randomNum2w)){
            randomNum3w = rnd.nextInt(5);
        }
        final String seatW3name = womanArray[randomNum3w];//女性席３決定

        randomNum4w = rnd.nextInt(5);
        while ((randomNum4w == randomNum1w)||(randomNum4w == randomNum2w)||(randomNum4w == randomNum3w)){
            randomNum4w = rnd.nextInt(5);
        }
        final String seatW4name = womanArray[randomNum4w];//女性席４決定

        randomNum5w = rnd.nextInt(5);
        while ((randomNum5w == randomNum1w)||(randomNum5w == randomNum2w)||(randomNum5w == randomNum3w)||(randomNum5w == randomNum4w)){
            randomNum5w = rnd.nextInt(5);
        }
        final String seatW5name = womanArray[randomNum5w];//女性席5決定

        //テキスト紐付け
        final TextView textM1 = findViewById(R.id.manA);
        final TextView textM2 = findViewById(R.id.manB);
        final TextView textM3 = findViewById(R.id.manC);
        final TextView textM4 = findViewById(R.id.manD);
        final TextView textM5 = findViewById(R.id.manE);
        final TextView textW1 = findViewById(R.id.womanA);
        final TextView textW2 = findViewById(R.id.womanB);
        final TextView textW3 = findViewById(R.id.womanC);
        final TextView textW4 = findViewById(R.id.womanD);
        final TextView textW5 = findViewById(R.id.womanE);

        //ボタン紐付け
        Button buttonM1 = findViewById(R.id.manA_button);
        Button buttonM2 = findViewById(R.id.manB_button);
        Button buttonM3 = findViewById(R.id.manC_button);
        Button buttonM4 = findViewById(R.id.manD_button);
        Button buttonM5 = findViewById(R.id.manE_button);

        Button buttonW1 = findViewById(R.id.womanA_button);
        Button buttonW2 = findViewById(R.id.womanB_button);
        Button buttonW3 = findViewById(R.id.womanC_button);
        Button buttonW4 = findViewById(R.id.womanD_button);
        Button buttonW5 = findViewById(R.id.womanE_button);

        //ボタン押すと席open!
        //ここから男性open
        buttonM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textM1.setText(seatM1name);
            }
        });
        buttonM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textM2.setText(seatM2name);
            }
        });
        buttonM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textM3.setText(seatM3name);
            }
        });
        buttonM4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textM4.setText(seatM4name);
            }
        });
        buttonM5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textM5.setText(seatM5name);
            }
        });

        //女性席open
        buttonW1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textW1.setText(seatW1name);
            }
        });
        buttonW2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textW2.setText(seatW2name);
            }
        });
        buttonW3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textW3.setText(seatW3name);
            }
        });
        buttonW4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textW4.setText(seatW4name);
            }
        });
        buttonW5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textW5.setText(seatW5name);
            }
        });
        //戻るボタン
        final Button finish = findViewById(R.id.back);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
