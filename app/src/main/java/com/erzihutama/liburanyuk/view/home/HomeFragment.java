package com.erzihutama.liburanyuk.view.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.adapter.InterestAdapter;
import com.erzihutama.liburanyuk.adapter.TopAdapter;
import com.erzihutama.liburanyuk.model.InterestModel;
import com.erzihutama.liburanyuk.model.TopModel;
import com.erzihutama.liburanyuk.IntroActivity;

import java.util.ArrayList;
import java.util.Vector;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.erzihutama.liburanyuk.R.id.Artcultre;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    private RecyclerView mRecycleView2;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager2;

    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    Vector<TopModel> youtubeVideos = new Vector<TopModel>();
    //inisialisasi bind view untuk pindah halaman buterknife

    @BindView(R.id.Artcultre)
    CardView artculture;

    @BindView(R.id.Enterteiment)
        CardView enterteinment;
    //
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

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
        recyclerView = (RecyclerView)view.findViewById(R.id.daily_id_r_top);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL,false));
        youtubeVideos.add(new TopModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ruKqXQ2KtH4\" frameborder=\"0\" allow=\" encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new TopModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XrdVOE-WR9o\" frameborder=\"0\" allow=\" encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new TopModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/f5Vdh6pWsZY\" frameborder=\"0\" allow=\" encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new TopModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/v=ojQbArbuN4E\" frameborder=\"0\" allowfullscreen></iframe>"));
        TopAdapter hightlightAdapter = new TopAdapter(youtubeVideos);
        recyclerView.setAdapter(hightlightAdapter);


        ButterKnife.bind(this,view);;

        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @OnClick(R.id.Artcultre)
    public void klik(){

        Intent i=new Intent(getContext(),Artactivity.class);
        startActivity(i);
    }

    @OnClick(R.id.Enterteiment)
    public void klik2(){

        Intent i=new Intent(getContext(),enterActivity.class);
        startActivity(i);
    }


    public interface OnFragmentInteractionListener {
        /**
         * @param uri
         */
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


    }




        // rest of code?kml

