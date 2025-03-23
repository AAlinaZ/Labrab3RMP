package com.aalinaz.chatimmitate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linearLayoutButton = findViewById(R.id.linearLayoutButton);
        Button constraintLayoutButton = findViewById(R.id.constraintLayoutButton);
        Button frameLayoutButton = findViewById(R.id.frameLayoutButton);

        linearLayoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
            startActivity(intent);
        });

        constraintLayoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
            startActivity(intent);
        });

        frameLayoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
            startActivity(intent);
        });
    }
}