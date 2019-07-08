package com.erzihutama.liburanyuk.view.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.adapter.FavAdapter;
import com.erzihutama.liburanyuk.adapter.InterestAdapter;
import com.erzihutama.liburanyuk.model.FavModel;
import com.erzihutama.liburanyuk.model.InterestModel;

import java.util.ArrayList;


public class mytripFragment extends Fragment {

    private RecyclerView mRecycleView2;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mytrip, container, false);


        ArrayList<FavModel> favModels = new ArrayList<>();
        favModels.add(new FavModel(R.drawable.baner1,"Tempat Wisata","Budaya di indonesia sangat berakenak ragam dan menjadi tempat favorit untuk mengenal budaya di indonesia"));
        favModels.add(new FavModel(R.drawable.baner2,"Budaya","Budaya di indonesia sangat berakenak ragam dan menjadi tempat favorit untuk mengenal budaya di indonesia"));
        favModels.add(new FavModel(R.drawable.baner1,"Tempat Makan","Budaya di indonesia sangat berakenak ragam dan menjadi tempat favorit untuk mengenal budaya di indonesia"));


        mRecycleView2 = view.findViewById(R.id.daily_id_r_fav);
        mRecycleView2.setHasFixedSize(true);
        mLayoutManager2 = new LinearLayoutManager(getActivity());
        mAdapter2 = new FavAdapter(favModels);


        mRecycleView2.setLayoutManager(mLayoutManager2);
        mRecycleView2.setAdapter(mAdapter2);

        return view;
    }}

