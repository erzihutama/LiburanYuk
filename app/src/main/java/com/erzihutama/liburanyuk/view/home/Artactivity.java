package com.erzihutama.liburanyuk.view.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;


import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.adapter.OutdorAdapter;
import com.erzihutama.liburanyuk.api.ApiOutdorEndPoint;
import com.erzihutama.liburanyuk.api.ApiOutdorService;
import com.erzihutama.liburanyuk.model.OutdorModel;
import com.erzihutama.liburanyuk.model.OutdorResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Artactivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private OutdorAdapter viewAdapter;
    private List<OutdorModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
         viewAdapter = new OutdorAdapter(this, list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        rvCategory.setLayoutManager(mLayoutManager);
        rvCategory.setItemAnimator(new DefaultItemAnimator());
        rvCategory.setAdapter(viewAdapter);
        ApiOutdorService api = ApiOutdorEndPoint.getClient().create(ApiOutdorService.class);
        Call<OutdorResponse> call = api.getOutdor();
        call.enqueue(new Callback<OutdorResponse>(){

                         @Override
                         public void onResponse(Call<OutdorResponse> call, Response<OutdorResponse> response) {
                             list = response.body().getItem();
                             viewAdapter = new OutdorAdapter(getApplication(), list);
                             rvCategory.setAdapter(viewAdapter);
                         }

                         @Override
                         public void onFailure(Call<OutdorResponse> call, Throwable t) {
                             Toast.makeText(Artactivity.this, "Oops, your connection is WONGKY! ", Toast.LENGTH_SHORT).show();
                         }


        }



        );}


    private void loadDataTokohUlama(){
        ApiOutdorService api = ApiOutdorEndPoint.getClient().create(ApiOutdorService.class);
        Call<OutdorResponse> call=api.getOutdor();
        call.enqueue(new Callback<OutdorResponse>() {
            @Override
            public void onResponse(Call<OutdorResponse> call, Response<OutdorResponse> response) {

            }

            @Override
            public void onFailure(Call<OutdorResponse> call, Throwable t) {

            }

        });

    }

}
