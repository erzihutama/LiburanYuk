package com.erzihutama.liburanyuk.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiOutdorEndPoint {


    //String URL = "http://localhost:8888/mcu/";
    //String URL = "http://127.0.0.1/mcu/";
    //emulator
    private static final String BASE_URL = "https://api.myjson.com/bins/";
    //device same network
    //private static final String BASE_URL = "http://192.168.43.170/mcu/";
    //private static final String BASE_URL = "http://192.168.43.1/mcu/";

    private static Retrofit retrofit;
    public static Retrofit getClient()
    {
        if(retrofit == null)
        {
//            Gson gson = new GsonBuilder().setLenient().create();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return  retrofit;
    }
}
