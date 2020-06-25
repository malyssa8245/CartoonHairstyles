package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AdventureTimeQuiz extends AppCompatActivity {

    TextView question;
    Button a1;
    Button a2;
    Button a3;
    Button a4;
    Button a5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_time_quiz);
        question = findViewById(R.id.question);
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);

        Question question1 = new Question("What do you want to be in the future?","Pediatrician", "Musician","The President","Hero", "Comedian" );

        Question question2 = new Question(" What would people describe you as?","Responsible, Kind","Down to earth,chill","Uptight, Short tempered", "Adventurous, Helpful, Loving","funny, tough, loveable");
        Question question3 = new Question("You go to the beach and your friend forgets sunscreen. What do you do?","I would most likely come with extra sunscreen.","Oh well, that’s not my problem.","I wasn’t invited so… ");
       // Question question4 = new Question("How would you plan a party?");
      //  Question question5 = new Question("If you knew you had a few days left to live, what would you do?");

        question.setText(question1.getQuestion());
        question.setText(question2.getQuestion());




    }

}

whe