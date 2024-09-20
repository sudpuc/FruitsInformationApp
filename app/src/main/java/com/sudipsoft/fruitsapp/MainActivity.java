package com.sudipsoft.fruitsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button app;
    Button man;
    Button ban;
    Button gua;
    Button jack;
    Button kiwi;
    Button water;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app = findViewById(R.id.apple);
        man = findViewById(R.id.mango);
        ban = findViewById(R.id.banana);
        gua = findViewById(R.id.guava);
        jack =findViewById(R.id.jack);
        kiwi = findViewById(R.id.kiwi);
        water = findViewById(R.id.water);


        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ia= new Intent(MainActivity.this,MainActivityApple.class);
                startActivity(ia);

            }
        });

        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent im= new Intent(MainActivity.this,MainActivityMango.class);
                startActivity(im);

            }
        });



        ban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ib = new Intent(MainActivity.this,MainActivityBanana.class);
                startActivity(ib);
            }
        });
        gua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig = new Intent(MainActivity.this,MainActivityGuava.class);
                startActivity(ig);
            }
        });
        jack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ij = new Intent(MainActivity.this,MainActivityJack.class);
                startActivity(ij);
            }
        });

        kiwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ik = new Intent(MainActivity.this,MainActivityKiwi.class);
                startActivity(ik);
            }
        });

        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iw = new Intent(MainActivity.this,MainActivityWatermelon.class);
                startActivity(iw);
            }
        });

    }
}