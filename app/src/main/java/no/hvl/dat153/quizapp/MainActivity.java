package no.hvl.dat153.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonQuiz = findViewById(R.id.buttonQuiz);

        buttonQuiz.setOnClickListener(V ->{
            Intent intent = new Intent(MainActivity.this, QuizActivity.class);
            startActivity(intent);
        } );

    }
}