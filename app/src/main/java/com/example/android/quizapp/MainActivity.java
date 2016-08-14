package com.example.android.quizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {
    private int myScore = 0;
    private String enterMotto = "Semper Fidelis";
    private CheckBox mcrdpiCheckBox;
    private CheckBox mcrdsdCheckBox;

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
    CheckBox mcrdpiCheckBox = (CheckBox) findViewById(R.id.Parris_Island & R.id.San_Diego);
    boolean isMCRDPI = mcrdpiCheckBox.isChecked();
    // Correct answer #2 for bootcamp
    CheckBox mcrdsdCheckBox = (CheckBox) findViewById(R.id.San_Diego);
    boolean isMCRDSD = mcrdsdCheckBox.isChecked();
    // Correct answer for enter text
    EditText enterMotto = (EditText)findViewById(R.id.enter_text);
    String motto = enterMotto.getText().toString().trim();

    myScore = totalScore(isTT, isSN, is1957, isMCRDPI, isMCRDSD);
        Toast.makeText(getApplicationContext(), "Congratulations! Your score is: " + myScore + " / 5",
                Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if(enterMotto.equals("Semper Fidelis")) {
            myScore = myScore + 1;
        }    else {
            myScore = myScore + 0;
        }
        return myScore;
    }
    //reset the quiz
      public void reset (View view) {

          ((RadioGroup) findViewById(R.id.radio_group_1)).clearCheck();
          ((RadioGroup) findViewById(R.id.radio_group_2)).clearCheck();
          ((RadioGroup) findViewById(R.id.radio_group_3)).clearCheck();
          ((CheckBox) findViewById(R.id.San_Diego)).setChecked(false);
          ((CheckBox) findViewById(R.id.Washington_DC)).setChecked(false);
          ((CheckBox) findViewById(R.id.Parris_Island)).setChecked(false);

      }

    }


