package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AdventureTimeQuiz extends AppCompatActivity {

    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_time_quiz);
        question = findViewById(R.id.question);
    }

    public static void main(String[] args) {
        Question question1 = new Question("What do you want to be in the future?");
        Question question2 = new Question(" What would people describe you as?");
        Question question3 = new Question("You go to the beach and your friend forgets sunscreen. What do you do?");
        Question question4 = new Question("How would you plan a party?");
        Question question5 = new Question("If you knew you had a few days left to live, what would you do?");
        question1.askit();

    }

}
