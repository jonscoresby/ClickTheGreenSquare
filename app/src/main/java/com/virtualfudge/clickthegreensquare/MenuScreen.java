package com.virtualfudge.clickthegreensquare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MenuScreen extends Activity {

    public void launchGame(View view){
        Intent startGameActivity = new Intent(this, StartScreen.class);
        startActivity(startGameActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }
}

