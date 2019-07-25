package com.erzihutama.liburanyuk.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.model.OutdorModel;
import com.erzihutama.liburanyuk.model.OutdorResponse;

import java.util.List;

import retrofit2.Callback;

public class OutdorAdapter extends RecyclerView.Adapter<OutdorAdapter.MyHolder> {
    List<OutdorModel> mList ;
    Context ctx;

    public OutdorAdapter(Context ctx, List<OutdorModel> mList) {
        this.mList = mList;
        this.ctx = (Context) ctx;
    }



    @Override
    public OutdorAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,parent, false);
        MyHolder holder = new MyHolder(layout);
        return holder;

    }

    @Override
    public void onBindViewHolder(OutdorAdapter.MyHolder holder, final int position) {
        OutdorModel OutdorModel = mList.get(position);
        holder.namatempat.setText(OutdorModel.getNama_tempat());
        holder.daerah.setText(OutdorModel.getDaerah());
        Glide.with(ctx)
                .load(OutdorModel.getPhoto())
                .override(350,550)
                .into(holder.gambar);

    }

    @Override
    public int getItemCount()
    {
        return mList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView namatempat, daerah;
        ImageView gambar;
        CardView cardView;
        OutdorModel OutdorModel;
        public MyHolder(View v)
        {
            super(v);

            namatempat  = (TextView) v.findViewById(R.id.tv_item_name);
            daerah = (TextView) v.findViewById(R.id.tv_item_remarks);
            gambar = (ImageView) v.findViewById(R.id.img_item_photo);
//            cardView = (CardView)itemView.findViewById(R.id.item_card);
//            cardView.setOnClickListener(this);

        }


    }
}