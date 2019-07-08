package com.erzihutama.liburanyuk.model;


public class InterestModel {
    private int mImageResource;
    private String namaGambar;
    private String descGambar;

    public InterestModel(int ImageResource, String namagambar , String descgambar){
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