package com.erzihutama.liburanyuk.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.model.InterestModel;
import com.erzihutama.liburanyuk.model.TopModel;

import java.util.ArrayList;


public class TopAdapter extends RecyclerView.Adapter<TopAdapter.FriendsViewHolder> {
    private ArrayList<TopModel> mTopItem;

    public static class FriendsViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView namaGambar;
        public TextView descGambar;

        public FriendsViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.img_top);
            namaGambar = itemView.findViewById(R.id.txt_judul_top);
            descGambar= itemView.findViewById(R.id.txt_des_top);
        }
    }

    public TopAdapter(ArrayList<TopModel> friendList){
        mTopItem = friendList;
    }

    @NonNull
    @Override
    public FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_list_item_topdestinasi,viewGroup,false);
        FriendsViewHolder va = new FriendsViewHolder(v);
        return va;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsViewHolder friendsViewHolder, int position) {
        TopModel currentItem = mTopItem.get(position);
        friendsViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        friendsViewHolder.namaGambar.setText(currentItem.getNamaGambar());
        friendsViewHolder.descGambar.setText(currentItem.getDescGambar());
    }

    @Override
    public int getItemCount() {
        return mTopItem.size();
    }



}
