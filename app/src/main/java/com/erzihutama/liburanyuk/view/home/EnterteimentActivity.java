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
import com.erzihutama.liburanyuk.adapter.BudayaAdapter;
import com.erzihutama.liburanyuk.adapter.EnterAdapter;
import com.erzihutama.liburanyuk.api.ApiBudayaService;
import com.erzihutama.liburanyuk.api.ApiEnterService;
import com.erzihutama.liburanyuk.api.ApiOutdorEndPoint;
import com.erzihutama.liburanyuk.model.BudayaItem;
import com.erzihutama.liburanyuk.model.BudayaModel;
import com.erzihutama.liburanyuk.model.EnterItem;
import com.erzihutama.liburanyuk.model.EnterModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class EnterteimentActivity extends Fragment {

    private EnterAdapter viewAdapter;
    private List<EnterItem> mItems = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final   View myFragment = inflater.inflate(R.layout.activity_enter, container, false);

        final RecyclerView recyclerView = myFragment.findViewById(R.id.rvEnter_item_xml);
        viewAdapter = new EnterAdapter(getContext(), mItems);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(viewAdapter);
        ApiEnterService api = ApiOutdorEndPoint.getClient().create(ApiEnterService.class);
        Call<EnterModel> call = api.getEnter();
        call.enqueue(new Callback<EnterModel>() {
            @Override
            public void onResponse(Call<EnterModel> call, Response<EnterModel> response) {
                mItems = response.body().getItem();
                viewAdapter = new EnterAdapter(getContext(), mItems);
                recyclerView.setAdapter(viewAdapter);
            }

            @Override
            public void onFailure(Call<EnterModel> call, Throwable t) {
                Toast.makeText(getContext(), "Oops, your connection is WONGKY! ", Toast.LENGTH_SHORT).show();

            }
        });

        return myFragment;
    }}

