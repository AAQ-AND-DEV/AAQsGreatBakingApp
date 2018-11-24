package com.aaqanddev.aaqsgreatbakingapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.aaqanddev.aaqsgreatbakingapp.utils.RetroService;
import com.aaqanddev.aaqsgreatbakingapp.views.AaqsStepsFragment;
import com.aaqanddev.aaqsgreatbakingapp.views.RecipeListFragment;

import javax.inject.Inject;

import androidx.fragment.app.Fragment;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainBakingActivity extends Activity implements HasSupportFragmentInjector {

    @Inject
    SharedPreferences sharedPreferences;

    @Inject
    AndroidInjector<RetroService> retroServiceAndroidInjector;

    @Inject
    DispatchingAndroidInjector<RecipeListFragment> recipeListFragmentInjector;

    @Inject
    DispatchingAndroidInjector<AaqsStepsFragment> stepsFragmentInject;

    //TODO find out how to handle multiple fragments
    //injected here
    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setContentView(R.layout.activity_main_baking);
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

    }
}
