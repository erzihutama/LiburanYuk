package com.erzihutama.liburanyuk.model;


public class FavModel {
    private int mImageResource;
    private String namaGambar;
    private String descGambar;

    public FavModel(int ImageResource, String namagambar , String descgambar){
        mImageResource = ImageResource;
        namaGambar = namagambar;
        descGambar = descgambar;

    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getNamaGambar(){
        return namaGambar;
    }

    public String getDescGambar() {
        return descGambar;
    }
}
