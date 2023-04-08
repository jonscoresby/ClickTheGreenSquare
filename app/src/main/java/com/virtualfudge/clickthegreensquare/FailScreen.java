package com.virtualfudge.clickthegreensquare;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class FailScreen extends Activity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail_screen);
    }

    public void restartGame(View view){
        Intent startGameActivity = new Intent(this, StartScreen.class);
        startActivity(startGameActivity);
    }

    public void startMenu(View view){
        Intent startMenuActivity = new Intent(this, MenuScreen.class);
        startActivity(startMenuActivity);
    }
}
