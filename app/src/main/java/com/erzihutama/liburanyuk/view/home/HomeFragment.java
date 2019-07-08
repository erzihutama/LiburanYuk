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
import com.erzihutama.liburanyuk.adapter.InterestAdapter;
import com.erzihutama.liburanyuk.adapter.TopAdapter;
import com.erzihutama.liburanyuk.model.InterestModel;
import com.erzihutama.liburanyuk.model.TopModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private RecyclerView mRecycleView2;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager2;

    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        ArrayList<InterestModel> InterestModels = new ArrayList<>();
        InterestModels.add(new InterestModel(R.drawable.baner1,"Tempat Wisata","Budaya di indonesia sangat berakenak ragam dan menjadi tempat favorit untuk mengenal budaya di indonesia"));
        InterestModels.add(new InterestModel(R.drawable.baner2,"Budaya","Budaya di indonesia sangat berakenak ragam dan menjadi tempat favorit untuk mengenal budaya di indonesia"));
        InterestModels.add(new InterestModel(R.drawable.baner1,"Tempat Makan","Budaya di indonesia sangat berakenak ragam dan menjadi tempat favorit untuk mengenal budaya di indonesia"));


        mRecycleView2 = view.findViewById(R.id.daily_id_r_h);
        mRecycleView2.setHasFixedSize(true);
        mLayoutManager2 = new LinearLayoutManager(getActivity());
        mAdapter2 = new InterestAdapter(InterestModels);

        mRecycleView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL,false));
        mRecycleView2.setAdapter(mAdapter2);



//        top destinasi recycleview


        ArrayList<TopModel> topModels = new ArrayList<>();
        topModels.add(new TopModel(R.drawable.baner1,"Tempat Wisata","Budaya di indonesia sangat berakenak ragam dan menjadi tempat favorit untuk mengenal budaya di indonesia"));
        topModels.add(new TopModel(R.drawable.baner2,"Budaya","Budaya di indonesia sangat berakenak ragam dan menjadi tempat favorit untuk mengenal budaya di indonesia"));
        topModels.add(new TopModel(R.drawable.baner1,"Tempat Makan","Budaya di indonesia sangat berakenak ragam dan menjadi tempat favorit untuk mengenal budaya di indonesia"));


        mRecycleView = view.findViewById(R.id.daily_id_r_top);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new TopAdapter(topModels);

        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL,false));
        mRecycleView.setAdapter(mAdapter);

        return view;
    }




}




        // rest of code

