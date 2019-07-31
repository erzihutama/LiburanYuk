package com.erzihutama.liburanyuk.api;

import com.erzihutama.liburanyuk.model.BudayaModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiBudayaService {
//    https://api.myjson.com/bins/
    //read  wfkqp
    @GET("peq9t")
    Call<BudayaModel> getBudaya();
}
