package com.erzihutama.liburanyuk.api;

import com.erzihutama.liburanyuk.model.OutdorResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiOutdorService {

    //read
    @GET("14do4h")
    Call<OutdorResponse> getOutdor();
}
