package com.erzihutama.liburanyuk.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
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
import com.erzihutama.liburanyuk.model.EnterItem;
import com.erzihutama.liburanyuk.view.home.DetailActivity;

import java.util.List;

public class EnterAdapter extends  RecyclerView.Adapter<EnterAdapter.MyHolder>  {

    List<EnterItem> mList;
    Context ctx;
    public EnterAdapter(Context ctx,List<EnterItem> mList) {
        this.mList = mList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public EnterAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardviewenter,viewGroup, false);

        final EnterAdapter.MyHolder holder = new EnterAdapter.MyHolder(layout);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx,DetailActivity.class);
                i.putExtra("Nama_tempat",mList.get(holder.getAdapterPosition()).getNama_tempatenter());
                i.putExtra("daerah",mList.get(holder.getAdapterPosition()).getDaerahenter());
                i.putExtra("deskripsi",mList.get(holder.getAdapterPosition()).getDeskripsi());
                i.putExtra("photo",mList.get(holder.getAdapterPosition()).getPhoto());
                i.putExtra("penilaian",mList.get(holder.getAdapterPosition()).getPenilaian());
                i.putExtra("jam",mList.get(holder.getAdapterPosition()).getJam());

                ctx.startActivity(i);

            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull EnterAdapter.MyHolder myHolder, int i) {
        EnterItem tokohList = mList.get(i);
        myHolder.nama_tempatenter.setText(tokohList.getNama_tempat());
        myHolder.daerahenter.setText(tokohList.getDaerahenter());
        Glide.with(ctx).load(tokohList.getPhoto()).override(350,550).into(myHolder.photoenter);



    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView nama_tempatenter, daerahenter, deskripsienter, btnsahre,jamenter;
        ImageView photoenter;
        CardView cardView;
        Button btnDetail;
        EnterItem tokohModels;
        public MyHolder(View v)
        {
            super(v);
            cardView = (CardView) v.findViewById(R.id.item_card2);
            nama_tempatenter  = (TextView) v.findViewById(R.id.tv_item_name2);
            daerahenter = (TextView) v.findViewById(R.id.tv_item_remarks2);
            photoenter = (ImageView) v.findViewById(R.id.img_item_photo2);
            btnsahre = (Button)itemView.findViewById(R.id.btn_set_share2);
            btnDetail = (Button) v.findViewById(R.id.btn_set_detail2);
        }
    }
}
