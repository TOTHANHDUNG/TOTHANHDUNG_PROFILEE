package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainSignInActivity extends AppCompatActivity {
    //Khai bao bien
    EditText edtUserName, edtPassword;
    Button btnSignIn;
    TextView TextVSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_main);
        edtUserName = (EditText) findViewById(R.id.editTextUserName);
        edtPassword = (EditText) findViewById(R.id.editTextPassword);
        TextVSignup = (TextView) findViewById(R.id.textViewSignUp);
        //Xet su kien
        Button btnSignIn = findViewById(R.id.buttonSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainSignInActivity.this, ProfileActivity.class);
                if (edtUserName.getText().toString().equals("") || edtPassword.getText().toString().equals("")) {
                    Toast.makeText(MainSignInActivity.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
                } else if (edtUserName.getText().toString().equals("dung") && edtPassword.getText().toString().equals("123")) {
                    Toast.makeText(MainSignInActivity.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                } else {
                    Toast.makeText(MainSignInActivity.this, "Thông tin đăng nhập sai!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        TextVSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainSignInActivity.this, SignupActivity.class);
                startActivity(in);
            }
        });
    }
}