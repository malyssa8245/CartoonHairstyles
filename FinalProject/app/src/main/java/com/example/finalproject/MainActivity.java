package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView playbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbutton = findViewById(R.id.playbutton);
        playbutton.setImageResource(R.drawable.playbutton);

       playbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               goToLevelPage();
           }
       });
    }

public void goToLevelPage(){

        Intent i = new Intent(this,LevelPage.class);
        startActivity(i);
}


}
//this a testing comment catherine //