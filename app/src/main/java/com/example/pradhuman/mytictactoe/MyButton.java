package com.example.pradhuman.mytictactoe;

import android.content.Context;
import android.widget.Button;
/**
 * Created by Pradhuman on 15-06-2017.
 */


public class MyButton  extends Button{
    int player;

    public MyButton(Context context) {
        super(context);
        player = MainActivity.NO_PLAYER;
    }


    int getPlayer(){
        return  player;
    }

}