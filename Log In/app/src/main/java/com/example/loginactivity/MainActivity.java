package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername, txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViews();
        btnLogin.setOnClickListener(LoginButtonClick);
    }

    public void getViews()
    {
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    public void LoginValid()
    {
        Intent myIntent = new Intent(this, MainActivity2.class);
        startActivity(myIntent);
    }

    public void LoginInvalid()
    {
        Toast myToast = Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_LONG);
        myToast.show();
    }

    private View.OnClickListener LoginButtonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(txtUsername.getText().toString().equals("admin") && txtPassword.getText().toString().equals("admin123@"))
            {
                LoginValid();
            }
            else
            {
                LoginInvalid();
            }
        }
    };
}