package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(score);
    }

    public void resetScore(View view)
    {
        scoreTeamB =0;
        scoreTeamA =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score)
    {
        TextView scoreView =(TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreePointsForTeamA(View view)
    {
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointsForTeamA(View view)
    {
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    public void addOnePointForTeamA(View view)
    {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView =(TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreePointsForTeamB(View view)
    {
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPointsForTeamB(View view)
    {
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    public void addOnePointForTeamB(View view)
    {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }
}
