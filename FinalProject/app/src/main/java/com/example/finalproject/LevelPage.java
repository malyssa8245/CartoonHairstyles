package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import android.widget.ImageView;


public class LevelPage extends AppCompatActivity {



    Button adventuretime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page);

        adventuretime = findViewById(R.id.adventuretime);
        adventuretime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAdventureTimeQuiz();
            }


         });




        
    }


    public void goToAdventureTimeQuiz(){

        Intent i = new Intent(this,AdventureTimeQuiz.class);
        startActivity(i);



}}






