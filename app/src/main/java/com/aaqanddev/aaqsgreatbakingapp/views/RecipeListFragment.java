package com.aaqanddev.aaqsgreatbakingapp.views;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aaqanddev.aaqsgreatbakingapp.R;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import dagger.android.DaggerFragment;


public class RecipeListFragment extends DaggerFragment {
    //TODO (1) inject RVAdapter,
    //TODO (2)
    //@Inject
    //TODO update fragment to DI approach

    private RecipeListViewModel mViewModel;

    public static RecipeListFragment newInstance() {
        return new RecipeListFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recipe_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //mViewModel = ViewModelProviders.of(this).get(RecipeListViewModel.class);
        // TODO: Use the ViewModel
    }

}
