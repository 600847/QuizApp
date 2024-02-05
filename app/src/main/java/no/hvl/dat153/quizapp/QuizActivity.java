package no.hvl.dat153.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class QuizActivity extends AppCompatActivity {
    
    private int score;
    private TextView textViewScore;
    private ImageView imageView;
    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //Get components
        textViewScore = findViewById(R.id.textViewScore);
        imageView = findViewById(R.id.imageView);
        buttonChoice1 = findViewById(R.id.buttonChoice1);
        buttonChoice2 = findViewById(R.id.buttonChoice2);
        buttonChoice3 = findViewById(R.id.buttonChoice3);

        // set choices


        //set quiz
        setQuiz();
    }

    private void setQuiz(){

    }

    public void checkAnswer(View v){
        Button clickedButton = (Button) v;
        String buttonText = clickedButton.getText().toString();
        if(buttonText.equals("Hei")){
            Toast.makeText(v.getContext(), buttonText, Toast.LENGTH_SHORT).show();
            score++;
            textViewScore.setText("Score: " + score);
        }else{
            Toast.makeText(v.getContext(), "Stupid fuck", Toast.LENGTH_SHORT).show();
        }
    }
}
