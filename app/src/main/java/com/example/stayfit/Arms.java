package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Arms extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);
        button=(Button)findViewById(R.id.sbcurl);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Arms.this,suspension_bicep.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.dipush);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Arms.this,diamond.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.chinu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Arms.this,chinup.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.cgc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Arms.this,cgcurl.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.tdip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Arms.this,tricep.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.hammerc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Arms.this,hcurl.class);
                startActivity(intent);
            }
        });
    }
}