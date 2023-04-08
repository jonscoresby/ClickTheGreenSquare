package com.virtualfudge.clickthegreensquare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class StartScreen extends Activity {
    List<Button> blocks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        ButtonGrid.buildGrid(blocks, this);
        ButtonGrid.resetButtons(blocks);
    }

    private void gameAdvance (int buttonNumber) {
        if (0 == ButtonGrid.getButtonClicked(blocks, this, buttonNumber)) runGame();
    }

    private void runGame(){
        Intent startGameRun = new Intent(this, GameRun.class);
        startActivity(startGameRun);
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




