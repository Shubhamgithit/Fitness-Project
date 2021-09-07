package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class HomeWorkout_Activity2 extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_workout_2);
        button=(Button)findViewById(R.id.setsit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeWorkout_Activity2.this,homesitup.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.settri);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeWorkout_Activity2.this,hometricep.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.setglu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeWorkout_Activity2.this,homeglu.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.setlun);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeWorkout_Activity2.this,homelung.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.setssq);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeWorkout_Activity2.this,homesqu.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.setpush);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeWorkout_Activity2.this,homepushups.class);
                startActivity(intent);
            }
        });
    }
}