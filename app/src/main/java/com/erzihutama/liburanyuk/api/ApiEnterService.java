package com.erzihutama.liburanyuk.api;

import com.erzihutama.liburanyuk.model.OutdorResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEnterService {

    //read
    @GET("wfkqp")
    Call<OutdorResponse> getEnter();
}
