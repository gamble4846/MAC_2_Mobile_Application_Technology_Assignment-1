package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TestProject","onCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TestProject","onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TestProject","onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TestProject","onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TestProject","onStop Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TestProject","onRestart Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TestProject","onDestroy Called");
    }
}