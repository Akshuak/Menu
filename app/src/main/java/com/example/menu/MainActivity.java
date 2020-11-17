package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFood,btnStress;
    Button btnRun,btnHeart;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStress = findViewById(R.id.btnStress);
        btnFood = findViewById(R.id.btnFood);
        btnRun = findViewById(R.id.btnRun);
        btnHeart = findViewById(R.id.btnHeart);


        btnStress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(MainActivity.this,Stress.class);
                startActivity(intent);
            }
        });
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(MainActivity.this,Food.class);
                startActivity(intent);
            }
        });
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(MainActivity.this,Run.class);
                startActivity(intent);
            }
        });
        btnHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(MainActivity.this,Heart.class);
                startActivity(intent);
            }
        });

    }


}
