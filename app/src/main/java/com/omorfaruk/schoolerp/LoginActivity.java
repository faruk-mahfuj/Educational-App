package com.omorfaruk.schoolerp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    RelativeLayout btnSignin;
    EditText edEmail, edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignin = findViewById(R.id.btnSignin);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);


        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edEmail.getText().toString().length()==0 | edPassword.getText().toString().length()==0){

                    if(edEmail.getText().toString().length()==0 && edPassword.getText().toString().length()==0){
                        edEmail.setError("Required*");
                        edPassword.setError("Required*");
                    }
                   else if (edEmail.getText().toString().length()==0) edEmail.setError("Required*");
                    else if (edPassword.getText().toString().length()==0) edPassword.setError("Required*");



                }
                else {
                    Intent myIntent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(myIntent);
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    finish();
                    }






            }
        });


    }
}