package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class Shoulder extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);
        button=(Button)findViewById(R.id.barshr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Shoulder.this,barshrug.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.lraise);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Shoulder.this,lrasie.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.benover);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Shoulder.this,bentover.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.fraise);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Shoulder.this,Fraise123.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.shdep);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Shoulder.this,Spress_descrip.class);
                startActivity(intent);
            }
        });
        button = (Button)findViewById(R.id.newshoul);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent = new Intent(Shoulder.this,description_shou.class);
                 startActivity(intent);
            }
        });
    }
}