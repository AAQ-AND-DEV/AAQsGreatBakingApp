package com.aaqanddev.aaqsgreatbakingapp.di;

import com.aaqanddev.aaqsgreatbakingapp.MainBakingActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

public interface MainBakingActivitySubcomponent extends AndroidInjector<MainBakingActivity> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainBakingActivity> {}

}
