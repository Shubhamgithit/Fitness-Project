package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Weightloss_Activity2 extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightloss_2);
        button=(Button)findViewById(R.id.weightski);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Weightloss_Activity2.this,weightskip.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.kettleweight);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Weightloss_Activity2.this,weightkettle.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.weightsp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Weightloss_Activity2.this,sprintweight.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.weightjump);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Weightloss_Activity2.this,weightjump.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.frogweight);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Weightloss_Activity2.this,weightfrog.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.burp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Weightloss_Activity2.this,weightburp.class);
                startActivity(intent);
            }
        });
    }
}