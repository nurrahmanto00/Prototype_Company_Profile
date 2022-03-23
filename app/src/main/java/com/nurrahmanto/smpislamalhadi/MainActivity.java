package com.nurrahmanto.smpislamalhadi;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView gbr1;
    ImageView gbr2;
    ImageView gbr6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gbr1 = findViewById(R.id.gbr1);
        gbr2 = findViewById(R.id.gbr2);
        gbr6 = findViewById(R.id.gbr6);



        gbr1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);

            }
        });

        gbr2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, GaleriActivity.class);
                startActivity(intent);

            }
        });

        gbr6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, GaleriActivity.class);
                startActivity(intent);

            }
        });


    }
}