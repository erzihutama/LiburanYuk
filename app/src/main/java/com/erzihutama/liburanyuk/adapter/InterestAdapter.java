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

import java.util.ArrayList;


public class InterestAdapter extends RecyclerView.Adapter<InterestAdapter.FriendsViewHolder> {
    private ArrayList<InterestModel> mFriendItem;

    public static class FriendsViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView namaGambar;
        public TextView descGambar;

        public FriendsViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.friendGambar);
            namaGambar = itemView.findViewById(R.id.namaFriendGambar);
            descGambar= itemView.findViewById(R.id.namaFriendGambardes);
        }
    }

    public InterestAdapter(ArrayList<InterestModel> friendList){
        mFriendItem = friendList;
    }

    @NonNull
    @Override
    public FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_list_item_daily_frend,viewGroup,false);
        FriendsViewHolder va = new FriendsViewHolder(v);
        return va;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsViewHolder friendsViewHolder, int position) {
        InterestModel currentItem = mFriendItem.get(position);
        friendsViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        friendsViewHolder.namaGambar.setText(currentItem.getNamaGambar());
        friendsViewHolder.descGambar.setText(currentItem.getDescGambar());
    }

    @Override
    public int getItemCount() {
        return mFriendItem.size();
    }



}
