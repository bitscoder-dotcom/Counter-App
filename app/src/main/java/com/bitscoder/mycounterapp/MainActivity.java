package com.bitscoder.mycounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, counter_text;
    Button btn, clear_memory_btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        clear_memory_btn = findViewById(R.id.clear_memory_btn);
        counter_text = findViewById(R.id.counter_text);
        welcome_text = findViewById(R.id.welcome_text);

        // Adding the functionalities
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText(""+increaseCounter());
            }
        });

        clear_memory_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearCounter();
                counter_text.setText("0");
            }
        });
    }

    public int increaseCounter() {
        return ++counter;
    }

    public String clearCounter() {
        counter = 0;
        return "Memory cleared";
    }

}