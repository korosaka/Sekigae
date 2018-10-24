package com.dotinstall.gokonseki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explain3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain3);

         Button back = findViewById(R.id.back);
         Button next3 = findViewById(R.id.next3);

         back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 finish();
             }
         });

         next3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent33 = new Intent(Explain3.this,ThreeOnThree.class);
                 startActivity(intent33);
             }
         });
    }
}
