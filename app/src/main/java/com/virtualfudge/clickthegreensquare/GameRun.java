package com.virtualfudge.clickthegreensquare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class GameRun extends StartScreen {

    List<Button> blocks = new ArrayList<>();
    Chronometer gameTime;
    public final static String GAME_SCORE = "com.virtualfudge.clickthegreensquare.GAME_SCORE";
    int winningAmountOfFrames = 13;
    int frameNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_run);

        ButtonGrid.buildGrid(blocks, this);
        ButtonGrid.resetButtons(blocks);

        gameTime = findViewById(R.id.gameTime);
        gameTime.start();
        gameTime.setOnChronometerTickListener(chronometer -> {
            if (chronometer.getText().toString().equalsIgnoreCase("59:9")) {
                failScreen();
            }
        });
    }

    private void gameAdvance (int buttonNumber) {

        if (0 == ButtonGrid.getButtonClicked(blocks, this, buttonNumber)) {
            frameNumber++;
            if (frameNumber == winningAmountOfFrames) {
                winScreen();
            } else {
                ButtonGrid.resetButtons(blocks);
            }
        } else failScreen();
    }

    private void winScreen(){

        gameTime.stop();
        String gameScore = gameTime.getText().toString();
        Intent startWinScreen = new Intent(this, WinScreen.class);
        startWinScreen.putExtra(GAME_SCORE, gameScore);
        startActivity(startWinScreen);
        finish();
    }

    private void failScreen() {
        Intent startFailScreen = new Intent(this, FailScreen.class);
        startActivity(startFailScreen);
        gameTime.stop();
        finish();
    }

    public void advanceGame0(View view){
        gameAdvance(0);
    }

    public void advanceGame1(View view){
        gameAdvance(1);
    }

    public void advanceGame2(View view){
        gameAdvance(2);
    }

    public void advanceGame3(View view){
        gameAdvance(3);
    }

    public void advanceGame4(View view){
        gameAdvance(4);
    }

    public void advanceGame5(View view){
        gameAdvance(5);
    }

    public void advanceGame6(View view){
        gameAdvance(6);
    }

    public void advanceGame7(View view){
        gameAdvance(7);
    }

    public void advanceGame8(View view){
        gameAdvance(8);
    }
}
