package com.aaqanddev.aaqsgreatbakingapp.di;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasFragmentInjector;

//contemplating the app structure
// thinking I will have a detailActivity
// (had considered hosting all fragments
// on the mainActivity
// but it would be a lot of removing
// of frags and stuff, I think.
// I would go with 2 activities 1 for Listing/Map and other dedicated for detail. List/Map activity would have a toggle to switch between Map and ResultList fragment or you can just
// have then in a backstack.
// The case were you have to send back
// data from detailactivity to listactivity that can be
// done simply using activityforresult. – ZealDeveloper Feb 26 '14 at 6:59

public class AaqsBakingApp extends Application implements HasActivityInjector, HasFragmentInjector {

    private AaqsBakingAppComponent mAppComponent;

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
//TODO check on wifi -- since I can't connect to host 'dl.google.com'
        mAppComponent = DaggerAaqsBakingAppComponent
                .builder().appModule(new )
        DaggerAaqsBakingAppComponent.create()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return null;
    }
}
