package com.aalinaz.chatimmitate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConstraintLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        EditText editText = findViewById(R.id.editText);
        Button sendButton = findViewById(R.id.sendButton);
        LinearLayout messageContainer = findViewById(R.id.messageContainer);

        sendButton.setOnClickListener(v -> {
            String message = editText.getText().toString();
            if (!message.isEmpty()) {
                TextView textView = new TextView(this);
                textView.setText(message);
                messageContainer.addView(textView);
                editText.setText("");
            }
        });
    }
}


