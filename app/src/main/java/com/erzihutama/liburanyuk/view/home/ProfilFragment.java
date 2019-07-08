package com.erzihutama.liburanyuk.view.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import com.erzihutama.liburanyuk.R;
import java.util.ArrayList;
import java.util.List;




public class ProfilFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


//        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
//        // Set Tabs inside Toolbar
//        TabLayout tabs = (TabLayout) view.findViewById(R.id.result_tabs);
//        tabs.setupWithViewPager(viewPager);

        return view;
    }}

