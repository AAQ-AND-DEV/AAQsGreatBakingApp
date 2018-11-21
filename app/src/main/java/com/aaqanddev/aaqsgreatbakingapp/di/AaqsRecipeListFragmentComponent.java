package com.aaqanddev.aaqsgreatbakingapp.di;

import com.aaqanddev.aaqsgreatbakingapp.views.RecipeListFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

public interface AaqsRecipeListFragmentComponent extends AndroidInjector<RecipeListFragment> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<RecipeListFragment>{

    }
}
