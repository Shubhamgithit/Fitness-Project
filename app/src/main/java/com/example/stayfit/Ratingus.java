package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Ratingus extends AppCompatActivity {
    RatingBar ratingBar;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingus);
        ratingBar = findViewById(R.id.ratinghere);
        btSubmit=findViewById(R.id.button47);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(),s+ "Thankyou for Rating"
                ,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Ratingus.this,Activity2.class);
                startActivity(intent);

            }

        }


        );


    }
}