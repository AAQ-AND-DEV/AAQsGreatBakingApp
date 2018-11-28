package com.aaqanddev.aaqsgreatbakingapp.views;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aaqanddev.aaqsgreatbakingapp.R;

//TODO (NEXT) add a StepsFragModule
// TODO refine it
// TODO (set adapter and stuff for steps)

/**
 * A simple {@link Fragment} subclass.
 */
public class AaqsStepsFragment extends Fragment {


    public AaqsStepsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aaqs_steps, container, false);
    }

}
