package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class feedback extends AppCompatActivity {

    private EditText ouremail, subject, message;
    Button send;
    Button ratingbu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ratingbu=findViewById(R.id.button46);
        ratingbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(feedback.this,Ratingus.class);
                startActivity(intent);
            }
        });





        ouremail=findViewById(R.id.email);
        subject=findViewById(R.id.subject);
        message=findViewById(R.id.message);

        send=findViewById(R.id.btn_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String OurSubjectFeedback=subject.getText().toString();
                String OurMessageFeedback=message.getText().toString();
                String ourEmail=ouremail.getText().toString();
                String[] email_divide=ourEmail.split(",");
                Intent send=new Intent(Intent.ACTION_SEND);
                send.putExtra(Intent.EXTRA_EMAIL, email_divide);
                send.putExtra(Intent.EXTRA_SUBJECT, OurSubjectFeedback);
                send.putExtra(Intent.EXTRA_TEXT,OurMessageFeedback);
                send.setType("message/rfc822");
                send.setPackage("com.google.android.gm");
                startActivity(send);
                
            }
        });
    }
}