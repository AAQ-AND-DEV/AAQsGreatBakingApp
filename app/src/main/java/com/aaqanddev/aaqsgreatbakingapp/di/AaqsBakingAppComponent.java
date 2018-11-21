package com.aaqanddev.aaqsgreatbakingapp.di;

import com.aaqanddev.aaqsgreatbakingapp.MainBakingActivity;
import com.aaqanddev.aaqsgreatbakingapp.views.RecipeListFragment;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {MainBakingActivitySubcomponent.class, AaqsRecipeListFragmentComponent.class)
public abstract class MainBakingActivityModule {
    //Accept a builder of the subcomponent (mapped therein to the AndroidInjector)
    //return Factory with classKey associated
    //binds
    @Binds
    @IntoMap
    @ClassKey(MainBakingActivity.class)
    abstract AndroidInjector.Factory<?>
        bindYourActivityInjectorFactor(MainBakingActivitySubcomponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(RecipeListFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> provideRecipeListFrag
}

@Component(modules = {MainBakingActivityModule.class})
interface AaqsBakingAppComponent {}
