package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weightburp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightburp);
        Button button40 = (Button) findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mylink = new Intent(Intent.ACTION_VIEW);
                mylink.setData(Uri.parse("https://www.youtube.com/watch?v=qLBImHhCXSw"));
                startActivity(mylink);
            }
        });
    }
}