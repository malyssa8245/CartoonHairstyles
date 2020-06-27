package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class AdventureTimeQuiz extends AppCompatActivity {

    TextView question;
    Button a1;
    Button a2;
    Button a3;
    Button a4;
    Button a5;
ArrayList <HashMap> questions;
    int counter = 0;
    Question q1;
    Question q2;
    Question q3;
    Question q4;
    Question q5;

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

        questions = new ArrayList<>();
        HashMap<String, String> question1 = new HashMap<String, String>();
        question1.put("question", "What do you want to be in the future?");
        question1.put("Pediatrician", "Princess Bubblegum");
        question1.put("Musician", "Marceline");
        question1.put("The President", "the Ice king");
        question1.put("Hero", "finn");
        question1.put("Comedian", "jake");
      questions.add(question1);


        HashMap<String, String> question2 = new HashMap<String, String>();
        question2.put("question2", "What would people describe you as?");
        question2.put("Responsible, Kind", "Princess Bubblegum");
        question2.put("Down to earth,chill", "Marceline");
        question2.put("Uptight, Short tempered", "the Ice king");
        question2.put("Adventurous, Helpful, Loving", "finn");
        question2.put("funny, tough, loveable", "jake");
        questions.add(question2);






    q1 = new Question(" What do you want to be in the future?","Pediatrician","Musician","The President", "Hero","Comedian");
       q2 = new Question(" What would people describe you as?","Responsible, Kind","Down to earth,chill","Uptight, Short tempered", "Adventurous, Helpful, Loving","funny, tough, loveable");
       q3 = new Question("You go to the beach and your friend forgets sunscreen. What do you do?","I would most likely come with extra sunscreen.","Oh well, that’s not my problem.","I wasn’t invited so… ");
       // Question q4 = new Question("How would you plan a party?");
      //  Question q5 = new Question("If you knew you had a few days left to live, what would you do?");


       // question.setText(question2.getQuestion());

nextquestion();


    }


    public void nextquestion(){


        question.setText(questions.get(counter).get("question").toString());

    }

}

