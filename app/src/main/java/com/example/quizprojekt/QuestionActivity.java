package com.example.quizprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, FinishActivity.class);
            startActivity(intent);
        });
    }
}