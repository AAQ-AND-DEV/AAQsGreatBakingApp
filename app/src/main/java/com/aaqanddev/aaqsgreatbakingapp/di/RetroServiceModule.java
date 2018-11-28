package com.aaqanddev.aaqsgreatbakingapp.di;

import android.app.Application;

import com.aaqanddev.aaqsgreatbakingapp.utils.RetroService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RetroServiceModule {

    @Provides
    @Singleton
    RetroService providesRetroService(Application bakingApp){
        //TODO (implement Retro somehow
        return null;
    }
}
