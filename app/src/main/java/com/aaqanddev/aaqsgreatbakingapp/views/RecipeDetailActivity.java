package com.aaqanddev.aaqsgreatbakingapp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aaqanddev.aaqsgreatbakingapp.di.AaqsBakingApp;

public class RecipeDetailActivity extends AppCompatActivity {

    private AaqsBakingActivityModule appComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appComponent = ((App)getApplicationContext()).getAppComponent();
        appComponent.inject(this);
        //setContentView(R.layout.activity_recipe_detail);
    }
}
