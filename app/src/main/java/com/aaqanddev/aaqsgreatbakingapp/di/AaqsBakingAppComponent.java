package com.aaqanddev.aaqsgreatbakingapp.di;

import com.aaqanddev.aaqsgreatbakingapp.MainBakingActivity;
import com.aaqanddev.aaqsgreatbakingapp.utils.ExoplayServiceSubcomponent;
import com.aaqanddev.aaqsgreatbakingapp.views.RecipeListFragment;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

//module provides the bakingActivity classes
//I think I'll also be hosting the Details here?
//or  actually I should probably TODO (?) make a loadActivity

@Module(subcomponents = {
        MainBakingActivitySubcomponent.class,
        ExoplayServiceSubcomponent.class,
        RecipeDetailActivitySubcomponent.class,
        //RecipeListAdapterComponent.class,
        //StepsListAdapterComponent.class,
        RetroServiceModule.class,

        AaqsRecipeListFragmentComponent.class,
})
public abstract class MainBakingActivityModule {
    //Accept a builder of the subcomponent (mapped therein to the AndroidInjector)
    //return Factory with classKey associated
    //binds
    @Binds
    @IntoMap
    @ClassKey(MainBakingActivity.class)
    abstract AndroidInjector.Factory<?>
        bindYourActivityInjectorFactor(MainBakingActivitySubcomponent.Builder builder);

    //TODO is this a good place to make a provideRecipes()
    //provideSteps() etc.?
    //TODO uses @Provides annotation
    //I believe this is only necessary if
    //not marked as @Module


    @Binds
    @IntoMap
    @FragmentKey(RecipeListFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> provideRecipeListFrag
}

//So, here is declared the ApplicationComponent,
//the preceding class is a annotated to enlist
//the dependencies that the Injector will add
//(used to be "to the graph" in dagger1) when
//DaggerAaqsBakingApp class is generated
//which is injected in AaqsBakingApp in OnCreate
// with .create().inject(this)
//TODO (!ans)?: inject?
@Component(modules = {MainBakingActivityModule.class})
public interface AaqsBakingAppComponent extends AndroidInjector<AaqsBakingApp>{
    void inject(AaqsBakingApp app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(AaqsBakingApp app);
        AaqsBakingAppComponent build();
    }

}
