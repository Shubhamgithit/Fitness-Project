package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Chest extends AppCompatActivity {
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        button=(Button)findViewById(R.id.dips30);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Chest.this,dips123.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.bbpr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Chest.this,bbpress.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.idbpre);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Chest.this,idbpress.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.spups);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Chest.this,suspenpusups.class);
                startActivity(intent );
            }
        });
        button=(Button)findViewById(R.id.pups);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Chest.this,pushupss.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.ccover);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Chest.this,ccover.class);
                startActivity(intent);
            }
        });
    }
}