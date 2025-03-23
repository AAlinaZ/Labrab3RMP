package com.aalinaz.chatimmitate;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class FrameLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        ImageView imageView = findViewById(R.id.imageView);
        ImageButton imageButton = findViewById(R.id.imageButton);

        // Массив цветов для смены фона
        int[] colors = {
                ContextCompat.getColor(this, R.color.purple_200),
                ContextCompat.getColor(this, R.color.teal_200),
                ContextCompat.getColor(this, R.color.purple_500)
        };
        int[] currentColorIndex = {0};

        imageButton.setOnClickListener(v -> {
            currentColorIndex[0] = (currentColorIndex[0] + 1) % colors.length;
            imageView.setBackgroundColor(colors[currentColorIndex[0]]);
        });
    }
}