package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
protected WebView game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //init
        game =(WebView) findViewById(R.id.game);

        //setting

        //load

        game.loadUrl("file:///android_asset/game/index.html");
    }
}