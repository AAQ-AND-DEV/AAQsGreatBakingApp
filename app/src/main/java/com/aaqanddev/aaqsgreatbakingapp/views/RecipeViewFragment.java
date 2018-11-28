package com.aaqanddev.aaqsgreatbakingapp.views;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import dagger.android.DaggerFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aaqanddev.aaqsgreatbakingapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeViewFragment extends DaggerFragment {


    public RecipeViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe_view, container, false);
    }

}
