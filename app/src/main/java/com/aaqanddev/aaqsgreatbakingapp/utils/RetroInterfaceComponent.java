package com.aaqanddev.aaqsgreatbakingapp.utils;

import com.aaqanddev.aaqsgreatbakingapp.model.Recipe;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetroInterface {
    @GET("topher/2017/May/59121517_baking/baking.json")
    Call<List<Recipe>> getRecipes();
}
