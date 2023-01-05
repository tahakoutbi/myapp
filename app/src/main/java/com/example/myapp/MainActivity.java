package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View.OnClickListener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button3;
    private Button button1;
    private static final String TAG = "MainActivity";

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() method called");
        Log.i("LIFECYCLE ", getLocalClassName() + " : ici onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() method called");
        Log.i("LIFECYCLE ", getLocalClassName() + " : ici onResume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onPause() method called");
        Log.i("LIFECYCLE ", getLocalClassName() + " : ici onStop");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
        Log.i(TAG, "onPause() method called");
        Log.i("LIFECYCLE ", getLocalClassName() + " : ici onDestroy");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onPause() method called");
        Log.i("LIFECYCLE ", getLocalClassName() + " : ici onRestart");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() method called");
        Log.i("LIFECYCLE ", getLocalClassName() + " : ici onPause");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LIFECYCLE ", getLocalClassName() + " : ici onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button3 = findViewById(R.id.button3);
        button1 = findViewById(R.id.button1);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button clicked!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to open the new activity here
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
            }
        });
    }

}