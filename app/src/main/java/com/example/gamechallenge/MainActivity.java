package com.example.gamechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int trial = 0;
    Random random = new Random();
    int rand = random.nextInt(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void Game(View view){
        //int trial = 0;
        trial++;
        EditText number = findViewById(R.id.editTxtNum);
        String guessedNumber = number.getText().toString();
        int guessedNumberInt = Integer.parseInt(guessedNumber);
        TextView stat = findViewById(R.id.textStat);
            if (guessedNumberInt == rand && trial < 5){
                stat.setText("You Won");
            }else if (guessedNumberInt != rand && trial < 5){
                stat.setText("Wrong - Number of tries: " + Integer.toString(trial) + " / 5");
            }else {
                stat.setText("Sorry Game Over");
            }

        }

    public void Restart(View view){
        trial = 0;
        rand = random.nextInt(10);
        TextView stat = findViewById(R.id.textStat);
        stat.setText("");
    }
}

