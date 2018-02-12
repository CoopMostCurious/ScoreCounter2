package com.example.cooper.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int visitorScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayHomeScore(homeScore);
        displayVisitorScore(visitorScore);
    }
    public void displayHomeScore(int homeScore) {
        TextView scoreView = findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(homeScore));
    }
    public void displayVisitorScore(int visitorScore) {
        TextView scoreView = findViewById(R.id.visitor_score);
        scoreView.setText(String.valueOf(visitorScore));
    }

    public void scoreFreeThrowHome(View view) {
        homeScore++;
        displayHomeScore(homeScore);
    }

    public void scoreGoalHome(View view) {
        homeScore = homeScore + 2;
        displayHomeScore(homeScore);
    }

    public void scoreThreeHome(View view) {
        homeScore = homeScore + 3;
        displayHomeScore(homeScore);
    }

    public void scoreFreeThrowVisitor(View view) {
        visitorScore++;
        displayVisitorScore(visitorScore);
    }

    public void scoreGoalVisitor(View view) {
        visitorScore = visitorScore + 2;
        displayVisitorScore(visitorScore);
    }

    public void scoreThreeVistor(View view) {
        visitorScore = visitorScore + 3;
        displayVisitorScore(visitorScore);
    }

    public void resetAll(View view) {
        homeScore = 0;
        visitorScore = 0;
        displayHomeScore(homeScore);
        displayVisitorScore(visitorScore);
    }
}


