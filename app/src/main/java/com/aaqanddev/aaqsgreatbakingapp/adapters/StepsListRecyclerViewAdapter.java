package com.aaqanddev.aaqsgreatbakingapp.adapters;

import android.view.View;

import com.aaqanddev.aaqsgreatbakingapp.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import butterknife.BindView;

public class StepsListRecyclerViewAdapter extends RecyclerView.Adapter<> {

    @BindView(R.id.step)
    public class StepViewHolder extends ViewHolder {

        public StepViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
