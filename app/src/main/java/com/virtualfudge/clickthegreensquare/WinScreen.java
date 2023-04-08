package com.virtualfudge.clickthegreensquare;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class WinScreen extends Activity {

    String gameScore;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String gameScore = intent.getStringExtra(GameRun.GAME_SCORE);

        setContentView(R.layout.activity_win_screen);
        TextView currentScore = findViewById(R.id.score);
        TextView bestScore = findViewById(R.id.best);

        String highScore = this.getPreferences(Context.MODE_PRIVATE).getString("BEST_SCORE", "0");

        int cool = Integer.parseInt(gameScore.replace(":", ""));
        int cool2 = Integer.parseInt(highScore.replace(":", ""));

        if(cool2 == 0 || cool < cool2){
           bestScore.setText("BEST: " + gameScore);
           saveScore();
        } else bestScore.setText("BEST: " + highScore);

        currentScore.setText("SCORE: " + gameScore);
    }

    private void saveScore(){
        SharedPreferences.Editor sPEditor = this.getPreferences(Context.MODE_PRIVATE).edit();
        sPEditor.putString("BEST_SCORE", gameScore);
        sPEditor.apply();
    }

    public void restartGame(View view){
        Intent startGameActivity = new Intent(this, StartScreen.class);
        startActivity(startGameActivity);
        finish();
    }

    public void startMenu(View view){
        Intent startMenuActivity = new Intent(this, MenuScreen.class);
        startActivity(startMenuActivity);
        finish();
    }
}
