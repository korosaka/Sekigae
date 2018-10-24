package com.dotinstall.gokonseki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//ランダム数のためのインポート
import java.util.Random;

public class ThreeOnThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_on_three);

        String[] manArray = {"男性A","男性B","男性C"};
        String[] womanArray = {"女性A","女性B","女性C"};
        //何故か初期化しないとダメっぽい(for文内で使う場合は必要？？)
        int randomNum1m;
        int randomNum2m = 0;
        int randomNum3m = 0;
        int randomNum1w;
        int randomNum2w = 0;
        int randomNum3w = 0;

        Random rnd = new Random();

        //ここから男性ランダム作成
        //0~2ランダム数を代入
        randomNum1m = rnd.nextInt(3);
        final String seatM1Name = manArray[randomNum1m];

        //0~2ランダム数を代入、但し前と異なるまで繰り返し
        for(int i = 0;i >= 0;i++){
            randomNum2m = rnd.nextInt(3);
            if(randomNum2m != randomNum1m){
                break;
            }
        }
        final String seatM2Name = manArray[randomNum2m];

        //0~2ランダム数を代入、但し前と異なるまで繰り返し
        for(int i = 0;i >= 0;i++){
            randomNum3m = rnd.nextInt(3);
            if((randomNum3m != randomNum1m)&&(randomNum3m != randomNum2m)){
                break;
            }
        }
        final String seatM3Name = manArray[randomNum3m];

        //ここから女性ランダム作成
        //0~2ランダム数を代入
        randomNum1w = rnd.nextInt(3);
        final String seatW1Name = womanArray[randomNum1w];

        //0~2ランダム数を代入、但し前と異なるまで繰り返し
        for(int i = 0;i >= 0;i++){
            randomNum2w = rnd.nextInt(3);
            if(randomNum2w != randomNum1w){
                break;
            }
        }
        final String seatW2Name = womanArray[randomNum2w];

        //0~2ランダム数を代入、但し前と異なるまで繰り返し
        for(int i = 0;i >= 0;i++){
            randomNum3w = rnd.nextInt(3);
            if((randomNum3w != randomNum1w)&&(randomNum3w != randomNum2w)){
                break;
            }
        }
        final String seatW3Name = womanArray[randomNum3w];
        //ランダム作成終了

        //finalを付けないとエラーが発生
        final TextView textM1 = findViewById(R.id.manA);
        final TextView textM2 = findViewById(R.id.manB);
        final TextView textM3 = findViewById(R.id.manC);
        final TextView textW1 = findViewById(R.id.womanA);
        final TextView textW2 = findViewById(R.id.womanB);
        final TextView textW3 = findViewById(R.id.womanC);

        Button buttonM1 = findViewById(R.id.manA_button);
        Button buttonM2 = findViewById(R.id.manB_button);
        Button buttonM3 = findViewById(R.id.manC_button);
        Button buttonW1 = findViewById(R.id.womanA_button);
        Button buttonW2 = findViewById(R.id.womanB_button);
        Button buttonW3 = findViewById(R.id.womanC_button);

        //ボタン押すと席open!
        //ここから男性open
        buttonM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textM1.setText(seatM1Name);
            }
        });
        buttonM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textM2.setText(seatM2Name);
            }
        });
        buttonM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textM3.setText(seatM3Name);
            }
        });
        //ここから女性open
        buttonW1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textW1.setText(seatW1Name);
            }
        });
        buttonW2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textW2.setText(seatW2Name);
            }
        });
        buttonW3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textW3.setText(seatW3Name);
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
