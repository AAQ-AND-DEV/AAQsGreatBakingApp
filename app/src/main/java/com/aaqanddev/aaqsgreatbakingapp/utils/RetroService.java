package com.aaqanddev.aaqsgreatbakingapp.utils;

import android.content.Context;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroService {
    private static final String BASE_URL = "https://d17h27t6h515a5.cloudfront.net/";
    private static Retrofit sRetro = null;


    public static Retrofit getRetroInstance(){
        if (null == sRetro){
            Gson gson = new Gson();
            sRetro = new Retrofit.Builder()
                    .client(new OkHttpClient())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .baseUrl(BASE_URL)
                    .build();
        }
        return sRetro;
    }
}
