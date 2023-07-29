package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bclick;TextView t_counter;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bclick=findViewById(R.id.bclick);
        t_counter=findViewById(R.id.t_counter);
        bclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t_counter.setText(""+counter());
            }
        });
    }
    public int counter()
    {
        return count++;
    }
}