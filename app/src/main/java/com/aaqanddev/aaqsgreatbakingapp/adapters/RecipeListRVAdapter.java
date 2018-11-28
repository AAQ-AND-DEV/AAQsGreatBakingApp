package com.aaqanddev.aaqsgreatbakingapp.adapters;

import android.view.ViewGroup;

import com.aaqanddev.aaqsgreatbakingapp.model.Recipe;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class RecipeListRVAdapter extends BaseActivity {


    @NonNull
    @Override
    public Recipe onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Recipe holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecipeListViewHolder extends ViewHolder{
        public RecipeListViewHolder(){
            
        }

    }
}
