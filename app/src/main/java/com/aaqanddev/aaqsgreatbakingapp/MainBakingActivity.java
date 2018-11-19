package com.aaqanddev.aaqsgreatbakingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.android.AndroidInjection;

public class MainBakingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setContentView(R.layout.activity_main_baking);
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

    }
}
