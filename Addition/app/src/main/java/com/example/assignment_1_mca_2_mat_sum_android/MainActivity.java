package com.example.assignment_1_mca_2_mat_sum_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNumber1, txtNumber2;
    Button btnAddition;
    TextView tvAnswer;

    int number1 = 0;
    int number2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViews();
        btnAddition.setOnClickListener(AdditionButtonClick);
    }

    public void ConvertingValues()
    {
        if(!TextUtils.isEmpty(txtNumber1.getText().toString())) {
            try {
                number1 = Integer.parseInt(txtNumber1.getText().toString());
            } catch (NumberFormatException nfe) {
                number1 = 0;
                Toast myToast = Toast.makeText(this, "1st Number cannot be used as number default (0) will be used", Toast.LENGTH_LONG);
                myToast.show();
            }
        }
        else
        {
            number1 = 0;
            Toast myToast = Toast.makeText(this, "Please Enter 1st Number (0 Will Be Used)", Toast.LENGTH_LONG);
            myToast.show();
        }

        if(!TextUtils.isEmpty(txtNumber2.getText().toString())) {
            try {
                number2 = Integer.parseInt(txtNumber2.getText().toString());
            } catch (NumberFormatException nfe) {
                number2 = 0;
                Toast myToast = Toast.makeText(this, "2nd Number cannot be used as number default (0) will be used", Toast.LENGTH_LONG);
                myToast.show();
            }
        }
        else
        {
            number2 = 0;
            Toast myToast = Toast.makeText(this, "Please Enter 2nd Number (0 Will Be Used)", Toast.LENGTH_LONG);
            myToast.show();
        }
    }

    public void getViews()
    {
        txtNumber1 = (EditText) findViewById(R.id.txtNumber1);
        txtNumber2 = (EditText) findViewById(R.id.txtNumber2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        tvAnswer = (TextView) findViewById(R.id.tvAnswer);
    }

    private View.OnClickListener AdditionButtonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ConvertingValues();
            tvAnswer.setText("Answer :: " + Integer.toString(number1+number2));
        }
    };
}