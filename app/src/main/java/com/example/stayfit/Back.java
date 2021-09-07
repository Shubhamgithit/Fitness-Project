package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Back extends AppCompatActivity {
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        button=(Button)findViewById(R.id.chestsupport);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Back.this,chest_row.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.seatedrow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Back.this,seated_cable.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.bentover);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Back.this,bentover_rolls.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.inverted);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Back.this,invertedr.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.dumbellsingle);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Back.this,dumbellsingle_arm.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.renero);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Back.this,renegade.class);
                startActivity(intent);

            }
        });
    }
}