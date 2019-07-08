package com.erzihutama.liburanyuk.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.model.FavModel;
import com.erzihutama.liburanyuk.model.FavModel;

import java.util.ArrayList;


public class FavAdapter extends RecyclerView.Adapter<FavAdapter.FriendsViewHolder> {
    private ArrayList<FavModel> mFriendItem;

    public static class FriendsViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView namaGambar;
        public TextView descGambar;

        public FriendsViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.img_favorite);
            namaGambar = itemView.findViewById(R.id.txt_judul_fav);
            descGambar= itemView.findViewById(R.id.txt_des_fav);
        }
    }

    public FavAdapter(ArrayList<FavModel> friendList){
        mFriendItem = friendList;
    }

    @NonNull
    @Override
    public FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_list_item_favorite,viewGroup,false);
        FriendsViewHolder va = new FriendsViewHolder(v);
        return va;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsViewHolder friendsViewHolder, int position) {
        FavModel currentItem = mFriendItem.get(position);
        friendsViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        friendsViewHolder.namaGambar.setText(currentItem.getNamaGambar());
        friendsViewHolder.descGambar.setText(currentItem.getDescGambar());
    }

    @Override
    public int getItemCount() {
        return mFriendItem.size();
    }



}
