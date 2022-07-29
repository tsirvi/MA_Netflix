package com.example.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
    }

    public void handleSelection(View view) {
        Toast.makeText(this, "Image is tapped", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
        Toast.makeText(this, "ON start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
        Toast.makeText(this, "On pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
        Toast.makeText(this, "on Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
        Toast.makeText(this, "on resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
        Toast.makeText(this, "on stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
        Toast.makeText(this, "on Destroy", Toast.LENGTH_SHORT).show();
    }

}