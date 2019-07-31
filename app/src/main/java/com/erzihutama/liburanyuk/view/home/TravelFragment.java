package com.erzihutama.liburanyuk.view.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.adapter.TravelAdapter;
import com.erzihutama.liburanyuk.api.ApiOutdorEndPoint;
import com.erzihutama.liburanyuk.api.ApiOutdorService;
import com.erzihutama.liburanyuk.model.OutdorItem;
import com.erzihutama.liburanyuk.model.OutdorModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class TravelFragment extends Fragment {

    private TravelAdapter viewAdapter;
    private List<OutdorItem> mItems = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final   View myFragment = inflater.inflate(R.layout.activity_art, container, false);

        final RecyclerView recyclerView = myFragment.findViewById(R.id.rv_category);
        viewAdapter = new TravelAdapter(getContext(), mItems);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(viewAdapter);
        ApiOutdorService api = ApiOutdorEndPoint.getClient().create(ApiOutdorService.class);
        Call<OutdorModel> call = api.getOutdor();
        call.enqueue(new Callback<OutdorModel>() {
            @Override
            public void onResponse(Call<OutdorModel> call, Response<OutdorModel> response) {
                mItems = response.body().getItem();
                viewAdapter = new TravelAdapter(getContext(), mItems);
                recyclerView.setAdapter(viewAdapter);
            }

            @Override
            public void onFailure(Call<OutdorModel> call, Throwable t) {
                Toast.makeText(getContext(), "Oops, your connection is WONGKY! ", Toast.LENGTH_SHORT).show();

            }
        });

        return myFragment;
    }}

