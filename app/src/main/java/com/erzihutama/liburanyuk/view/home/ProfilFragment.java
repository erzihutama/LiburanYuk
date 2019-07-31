package com.erzihutama.liburanyuk.view.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.adapter.OutdorAdapter;
import com.erzihutama.liburanyuk.model.OutdorItem;

import java.util.ArrayList;
import java.util.List;


public class ProfilFragment extends Fragment {


    private OutdorAdapter viewAdapter;
    private List<OutdorItem> mItems = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragment = inflater.inflate(R.layout.fragment_profile,container,false);

        return myFragment;
    }


}

