package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class  Dumbbell_Activity2 extends AppCompatActivity {
    CardView shoulder;
    CardView chest;
    CardView arms;
    CardView legs;
    CardView back;
    CardView rest;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbbell_2);
        shoulder=findViewById(R.id.shoulder);
        chest=findViewById(R.id.chest);
        arms=findViewById(R.id.arms);
        legs=findViewById(R.id.legs);
        back=findViewById(R.id.back);
        rest=findViewById(R.id.rest);
        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dumbbell_Activity2.this,Shoulder.class));

            }
        });
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dumbbell_Activity2.this,Chest.class));

            }
        });
        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dumbbell_Activity2.this,Arms.class));

            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dumbbell_Activity2.this,Legs.class));

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dumbbell_Activity2.this,Back.class));

            }
        });







    }







}