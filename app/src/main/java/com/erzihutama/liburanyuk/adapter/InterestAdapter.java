package com.erzihutama.liburanyuk.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.model.OutdorItem;
import com.erzihutama.liburanyuk.view.home.DetailActivity;

import java.util.List;


public class InterestAdapter extends RecyclerView.Adapter<InterestAdapter.CardViewHolder> {

    List<OutdorItem> mlist;
    Context context;
    Activity activity;


    public InterestAdapter(Context context,List<OutdorItem>mlist){
        this.mlist = mlist;
        this.context = context;
    }

    @Override
    public InterestAdapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item_favorite, parent, false);
        final InterestAdapter.CardViewHolder viewHolder = new InterestAdapter.CardViewHolder(view);


        viewHolder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,DetailActivity.class);
                i.putExtra("Nama_tempat",mlist.get(viewHolder.getAdapterPosition()).getNama_tempat());
                i.putExtra("daerah",mlist.get(viewHolder.getAdapterPosition()).getDaerah());
                i.putExtra("deskripsi",mlist.get(viewHolder.getAdapterPosition()).getDeskripsi());
                i.putExtra("photo",mlist.get(viewHolder.getAdapterPosition()).getPhoto());
                i.putExtra("penilaian",mlist.get(viewHolder.getAdapterPosition()).getPenilaian());
                i.putExtra("jam",mlist.get(viewHolder.getAdapterPosition()).getJam());

                context.startActivity(i);

            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(InterestAdapter.CardViewHolder holder, int position) {
        OutdorItem k = mlist.get(position);
        Glide.with(context)
                .load(k.getPhoto())
                .override(350,550)
                .into(holder.imgPhoto);
        holder.tvname.setText(k.getNama_tempat());
        holder.tvremarks.setText(k.getDaerah());
        holder.outdorItem = k;

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder  {
        ImageView imgPhoto;
        TextView tvname, tvremarks;
        Button btndetail, btnsahre;
        CardView cardView;
        OutdorItem outdorItem;

        public CardViewHolder(View itemView) {
            super(itemView);

            tvname = (TextView)itemView.findViewById(R.id.txt_judul_fav);
            tvremarks = (TextView)itemView.findViewById(R.id.txt_des_fav);
            cardView = (CardView)itemView.findViewById(R.id.interest);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_favorite);

        }
    }
}
