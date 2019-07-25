package com.erzihutama.liburanyuk.view.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.erzihutama.liburanyuk.R;
import com.erzihutama.liburanyuk.model.DataModelArt;
import com.erzihutama.liburanyuk.model.OutdorModel;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        OutdorModel outdorModel= getIntent().getParcelableExtra("key");

        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView nilai = (TextView)findViewById(R.id.content_lahir);
        TextView jam = (TextView)findViewById(R.id.content_wafat);



        Glide.with(this).load(outdorModel.getPhoto()).override(350,550).into(gamabar);
        name.setText(outdorModel.getNama_tempat());
        remarks.setText(outdorModel.getDaerah());
        deskripsi.setText(outdorModel.getDeskripsi());
        nilai.setText(outdorModel.getPenilaian());
        jam.setText(outdorModel.getJam());


        Log.i("photo", outdorModel.getPhoto());
        Log.i("deskripsi", outdorModel.getDeskripsi());
    }


}
