package com.erzihutama.liburanyuk.api;

import com.erzihutama.liburanyuk.model.OutdorModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiOutdorService {
// wfkqp
    //read
    @GET("1bbhc1")
    Call<OutdorModel> getOutdor();
}
