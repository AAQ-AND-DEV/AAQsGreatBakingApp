package com.aaqanddev.aaqsgreatbakingapp.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BakingAppModule {

    Application mApp;

    public BakingAppModule(Application app){
        mApp = app;
    }

    @Provides
    @Singleton
    Application providesApplication(){
        return mApp;
    }
}
