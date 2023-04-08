package com.virtualfudge.clickthegreensquare;

import android.app.Activity;
import android.widget.Button;

import java.util.Collections;
import java.util.List;

public class ButtonGrid {

    public ButtonGrid() { }

    private static final int[] BUTTON_IDS = {
            R.id.game_button_0,
            R.id.game_button_1,
            R.id.game_button_2,
            R.id.game_button_3,
            R.id.game_button_4,
            R.id.game_button_5,
            R.id.game_button_6,
            R.id.game_button_7,
            R.id.game_button_8,
    };

    private static final int[] COLOR_IDS = {
            R.color.color_number_0,
            R.color.color_number_1,
            R.color.color_number_2,
            R.color.color_number_3,
            R.color.color_number_4,
            R.color.color_number_5,
            R.color.color_number_6,
            R.color.color_number_7,
            R.color.color_number_8,
    };

    public static void buildGrid(List<Button> blocks, Activity activity) {
        for (int id : BUTTON_IDS) {
            Button button = activity.findViewById(id);
            blocks.add(button);
        }
    }

    public static void resetButtons(List<Button> blocks){
        Collections.shuffle(blocks);
        for (int i = 0; i < BUTTON_IDS.length; i++) {
            blocks.get(i).setBackgroundResource(COLOR_IDS[i]);
        }
    }

    public static int getButtonClicked(List<Button> blocks, Activity activity, int buttonNumber){
        int buttonClicked;
        buttonClicked = blocks.indexOf(activity.findViewById(BUTTON_IDS[buttonNumber]));
        return buttonClicked;
    }
}
