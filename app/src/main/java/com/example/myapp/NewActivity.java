package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private Button button1;
    private static final String TAG = "MainActivity";
    private EditText editText;
    private Button buttonDisplay;
    private TextView textView;


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
        setContentView(R.layout.activity_new);
        button1 = findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NewActivity.this, "Button clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(NewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        editText = findViewById(R.id.edit_text);
        buttonDisplay = findViewById(R.id.button_display);
        textView = findViewById(R.id.text_view);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString();
                textView.setText(input);
            }
        });
    }
}