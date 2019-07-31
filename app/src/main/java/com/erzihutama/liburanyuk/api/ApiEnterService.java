package com.erzihutama.liburanyuk.api;

import com.erzihutama.liburanyuk.model.EnterModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEnterService {

    //read  wfkqp
    @GET("9zlpd")
    Call<EnterModel> getEnter();
}
