package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LevelPage extends AppCompatActivity {
ImageView Atime;
ImageView Tdrama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page);
        Atime.setImageResource(R.drawable.time);
        Tdrama.setImageResource(R.drawable.total);

     Atime = findViewById(R.id.Atime);
     Tdrama = findViewById(R.id.Tdrama);


        Atime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAdventureTimeQuiz();
            }
        });
    }

    public void goToAdventureTimeQuiz(){

        Intent i = new Intent(this,AdventureTimeQuiz.class);
        startActivity(i);
    }


}
