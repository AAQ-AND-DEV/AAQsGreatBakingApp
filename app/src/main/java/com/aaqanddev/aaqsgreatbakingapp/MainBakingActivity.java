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
import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.HasSupportFragmentInjector;


//DaggerAppCompatActivity has a couple of FragmentInjectors (support and frag)
//supportFragment
// your activity allows the fragments to be
// removed and replaced, you should add the initial
// fragment(s) to the activity during the activity's
// onCreate() method.
//So, this applies even if
//I assume DaggerAppCompatActivity allows for
public class MainBakingActivity extends DaggerAppCompatActivity implements HasSupportFragmentInjector {

    @Inject
    SharedPreferences sharedPreferences;

    //TODO (?) refine  an interface (for  @Retention(RUNTIME)
    //TODO (res) explore other Retention options, and their use cases
    //TODO (create the Module to @Provide the MainBakingApp dependencies)


    @Inject
    AndroidInjector<RetroService> retroServiceAndroidInjector;

    @Inject
    DispatchingAndroidInjector<RecipeListFragment> recipeListFragmentInjector;

    @Inject
    DispatchingAndroidInjector<AaqsStepsFragment> stepsFragmentInject;

    @Inject
    DispatchingAndroidInjector<Fragment> supportFragmentInjector;

    //TODO find out how to handle multiple fragments
    //injected here
    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return supportFragmentInjector;
    }

/*
        //TODO (c) access via DI DaggerAppCompatActivity
        // or use AndroidInjection.inject(this) like below?
        //not both
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setContentView(R.layout.activity_main_baking);
        //AndroidInjection.inject(this) will contribute all the
        //dependencies injected here, so

//        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

    }
    */
}
