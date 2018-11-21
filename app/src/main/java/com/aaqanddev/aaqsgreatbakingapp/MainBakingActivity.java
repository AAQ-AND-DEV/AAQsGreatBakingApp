package com.aaqanddev.aaqsgreatbakingapp;

import android.app.Activity;
import android.os.Bundle;

import dagger.android.AndroidInjection;

public class MainBakingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setContentView(R.layout.activity_main_baking);
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

    }
}
