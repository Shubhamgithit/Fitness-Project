package com.example.stayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class myplan extends AppCompatActivity {
    private EditText ouremail, subject, message;
    Button sending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myplan);
        ouremail=findViewById(R.id.email);
        subject=findViewById(R.id.subject);
        message=findViewById(R.id.message);
        sending=findViewById(R.id.myinfo);
        sending.setOnClickListener(new View.OnClickListener() {
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