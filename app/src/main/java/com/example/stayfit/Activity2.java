package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ScrollView;

public class  Activity2 extends AppCompatActivity {
    CardView dumbbell;
    CardView diet;
    CardView weightloss;
    CardView homeworkout;
    CardView home;
    CardView aboutus;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        dumbbell=findViewById(R.id.dumbbell);
        diet=findViewById(R.id.diet);
        weightloss=findViewById(R.id.weightloss);
        homeworkout=findViewById(R.id.homeworkout);
        home=findViewById(R.id.home);
        

        aboutus=findViewById(R.id.aboutus);
        dumbbell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,Dumbbell_Activity2.class));

            }
        });
        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,Diet_Activity2.class));

            }
        });
        weightloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,Weightloss_Activity2.class));

            }
        });
        homeworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,HomeWorkout_Activity2.class));

            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,home.class));

            }
        });
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,AboutUs_Activity2.class));

            }
        });






    }







}