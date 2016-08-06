package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int myScore = 0;

    public void submitQuiz(View view) {

        // Correct answer for birthplace of Marines
        RadioButton tunTavernRb = (RadioButton) findViewById(R.id.radio_TT);
        boolean isTT = tunTavernRb.isChecked();
        // Correct answer for 1st Commandant of the Marine Corps
        RadioButton samuelNicholasRb = (RadioButton) findViewById(R.id.radio_Samuel);
        boolean isSN = samuelNicholasRb.isChecked();
        // Correct answer for 1st SGTMAJ of the Marine Corps
        RadioButton sgtMajRb = (RadioButton) findViewById(R.id.radio_1957);
        boolean is1957 = sgtMajRb.isChecked();
        // Correct answer #1 for bootcamp
        CheckBox mcrdpiCheckBox = (CheckBox) findViewById(R.id.Parris_Island + R.id.San_Diego);
        boolean isMCRDPI = mcrdpiCheckBox.isChecked();
        // Correct answer #2 for bootcamp
        CheckBox mcrdsdCheckBox = (CheckBox) findViewById(R.id.San_Diego);
        boolean isMCRDSD = mcrdsdCheckBox.isChecked();
        // Correct answer for enter text
        EditText enterMotto = (EditText)findViewById(R.id.enter_text);
        String motto =  enterMotto.getText().toString();


           }

    private int totalScore(boolean isTT, boolean isSN, boolean is1957,boolean isMCRDPI, boolean isMCRDSD) {
        if(isTT){
            myScore = myScore +1;
        } else {
            myScore = myScore + 0;
        }
        if(isSN){
            myScore = myScore +1;
        } else {
            myScore = myScore + 0;
        }
        if(is1957){
            myScore = myScore +1;
        } else {
            myScore = myScore + 0;
        }
        if(isMCRDPI && isMCRDSD){
            myScore = myScore +1;
        } else {
            myScore = myScore + 0;
        }
        if (motto){

        }

        return myScore;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

      public void reset (View view) {
        myScore = 0;

        }

    }


