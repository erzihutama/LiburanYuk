package com.erzihutama.liburanyuk.view.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.erzihutama.liburanyuk.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String nama_tempat = getIntent().getExtras().getString("nama_tempat");
        String daerah= getIntent().getExtras().getString("daerah");
        String photo= getIntent().getExtras().getString("photo");
        String deskripsi1 = getIntent().getExtras().getString("deskripsi");
        String penilaian = getIntent().getExtras().getString("penilaian");
        String jam1 = getIntent().getExtras().getString("jam");



        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView nilai = (TextView)findViewById(R.id.content_lahir);
        TextView jam = (TextView)findViewById(R.id.content_wafat);


        name.setText(nama_tempat);
        remarks.setText(daerah);
        deskripsi.setText(deskripsi1);
        nilai.setText(penilaian);
        jam.setText(jam1);
        Glide.with(this).load(photo).into(gamabar);

    }


}
