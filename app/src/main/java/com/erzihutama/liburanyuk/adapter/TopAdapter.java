package com.erzihutama.liburanyuk.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.model.InterestModel;
import com.erzihutama.liburanyuk.model.TopModel;

import java.util.ArrayList;
import java.util.List;


public class TopAdapter extends RecyclerView.Adapter<TopAdapter.VideoViewHolder> {
    List<TopModel> youtubeVideoList;
    public TopAdapter(){}
    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_list_item_topdestinasi,viewGroup,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TopAdapter.VideoViewHolder videoHolder, int i) {
        videoHolder.videoWeb.loadData(youtubeVideoList.get(i).getVideoUrl(),"text/html","utf-8");

    }


    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }

    public TopAdapter(List<TopModel> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView videoWeb;
        public VideoViewHolder(View itemView){
            super(itemView);
            videoWeb = (WebView)itemView.findViewById(R.id.v_hightlight);
            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient());
        }
    }



}
