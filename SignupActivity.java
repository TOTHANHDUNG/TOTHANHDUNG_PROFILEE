package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView edTextSignIn=(TextView) findViewById(R.id.textViewSignIn);
        edTextSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenSignInActivity();
            }
        });
    }
    public void doOpenSignInActivity(){
        Intent myIntent=new Intent(this,MainSignInActivity.class);
        startActivity(myIntent);
    }
}