package com.example.android.quidditchscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variable to store the scores for each team
    int scoreGryffindor = 0; // score for Gryffindor
    int scoreRavenclaw = 0; // score for Ravenclaw

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Resets the scores for both teams
     */
    public void resetScore(View v) {
        scoreGryffindor = 0;
        scoreRavenclaw = 0;
        displayForGryffindor(scoreGryffindor);
        displayForRavenclaw(scoreRavenclaw);
    }


    /**
     * Displays the given score for Gryffindor
     */
    public void displayForGryffindor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gryffindor_score_view);
        scoreView.setText(String.valueOf(score));
        // Sometimes R.id will not find the view that is referenced by the ID. To overcome this,
        // try going to File > Invalidate Caches / Restart...
    }

    /**
     * Displays the given score for Ravenclaw.
     */
    public void displayForRavenclaw(int score) {
        TextView scoreView = findViewById(R.id.ravenclaw_score_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the value of a Quaffle being caught
     */
    public void quaffleMadeGryffindor(View v) {
        scoreGryffindor += 10;
        displayForGryffindor(scoreGryffindor);
    }

    /**
     * Displays the value of a Snitch catch
     */
    public void snitchCaughtGryffindor(View v) {
        scoreGryffindor += 150;
        displayForGryffindor(scoreGryffindor);
    }

    /**
     * Displays the value of a foul
     */
    public void foulMadeGryffindor(View v) {
        scoreGryffindor -= 15;
        displayForGryffindor(scoreGryffindor);
    }

    /**
     * Displays the value of a Quaffle being caught
     */
    public void quaffleMadeRavenclaw(View v) {
        scoreRavenclaw += 10;
        displayForRavenclaw(scoreRavenclaw);
    }

    /**
     * Displays the value of a Snitch catch
     */
    public void snitchCaughtRavenclaw(View v) {
        scoreRavenclaw += 150;
        displayForRavenclaw(scoreRavenclaw);
    }

    /**
     * Displays the value of a foul
     */
    public void foulMadeRavenclaw(View v) {
        scoreRavenclaw -= 15;
        displayForRavenclaw(scoreRavenclaw);
    }

}
