package com.dotinstall.gokonseki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explain4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain4);

        Button backTop = (Button) findViewById(R.id.backTop);
        Button next4 = (Button) findViewById(R.id.next4);

        backTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent44 = new Intent(Explain4.this,FourOnFour.class);
                startActivity(intent44);
            }
        });
    }
}
