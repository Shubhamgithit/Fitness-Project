package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Legs extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        button=(Button)findViewById(R.id.bbht);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Legs.this,barbellht.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.walkl);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Legs.this,walkingl.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.bodycalf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Legs.this,bodyweightcalf.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.legpr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Legs.this,legp.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.dumstep);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Legs.this,dumbellup.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.fsquat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Legs.this,fsqua.class);
                startActivity(intent);
            }
        });
    }
}