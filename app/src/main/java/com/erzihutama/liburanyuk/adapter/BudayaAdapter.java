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
import com.erzihutama.liburanyuk.model.BudayaItem;
import com.erzihutama.liburanyuk.view.home.DetailActivity;

import java.util.List;

public class BudayaAdapter extends  RecyclerView.Adapter<BudayaAdapter.MyHolder>  {

    List<BudayaItem> mList;
    Context ctx;
    public BudayaAdapter(Context ctx, List<BudayaItem> mList) {
        this.mList = mList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public BudayaAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardviewenter,viewGroup, false);
       final MyHolder holder = new MyHolder(layout);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx,DetailActivity.class);
                i.putExtra("Nama_tempat",mList.get(holder.getAdapterPosition()).getNama_tempat());
                i.putExtra("daerah",mList.get(holder.getAdapterPosition()).getDaerah());
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
    public void onBindViewHolder(@NonNull BudayaAdapter.MyHolder myHolder, int i) {
        BudayaItem budayalist = mList.get(i);
        myHolder.nama_tempat.setText(budayalist.getNama_tempat());
        myHolder.daerah.setText(budayalist.getDaerah());
        Glide.with(ctx).load(budayalist.getPhoto()).override(350,550).into(myHolder.photo);


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView nama_tempat, daerah, btnsahre;
        ImageView photo;
        Button btnDetail;
        CardView cardView;
        BudayaItem budayaModel;

        public MyHolder(View v) {
            super(v);

            nama_tempat = (TextView) v.findViewById(R.id.tv_item_name2);
            daerah = (TextView) v.findViewById(R.id.tv_item_remarks2);
            photo = (ImageView) v.findViewById(R.id.img_item_photo2);
            btnsahre = (Button) itemView.findViewById(R.id.btn_set_share2);
            btnDetail = (Button) v.findViewById(R.id.btn_set_detail2);
            cardView = (CardView) v.findViewById(R.id.item_card2);


        }
    }
}
