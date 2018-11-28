package com.aaqanddev.aaqsgreatbakingapp.di;

import com.aaqanddev.aaqsgreatbakingapp.views.RecipeListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class RecipeListFragModule {
    @ContributesAndroidInjector
    abstract RecipeListFragment bindRecipeListFrag();

}
