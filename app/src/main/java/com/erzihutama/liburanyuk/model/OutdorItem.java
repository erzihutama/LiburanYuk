package com.erzihutama.liburanyuk.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class OutdorItem implements Parcelable {

    private String id_liburan;
    private String nama_tempat;
    private String daerah;
    private String photo;
    private String deskripsi;
    private String penilaian;
    private String jam;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    protected OutdorItem(Parcel in) {
        id_liburan = in.readString();
        nama_tempat = in.readString();
        daerah = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
        penilaian = in.readString();
        jam = in.readString();
    }

    public static final Creator<OutdorItem> CREATOR = new Creator<OutdorItem>() {
        @Override
        public OutdorItem createFromParcel(Parcel in) {
            return new OutdorItem(in);
        }

        @Override
        public OutdorItem[] newArray(int size) {
            return new OutdorItem[size];
        }
    };

    public OutdorItem() {

    }

    public String getId_liburan() {
        return id_liburan;
    }

    public void setId_liburan(String id_liburan) {
        this.id_liburan = id_liburan;
    }

    public String getNama_tempat() {
        return nama_tempat;
    }

    public void setNama_tempat(String nama_tempat) {
        this.nama_tempat = nama_tempat;
    }

    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getPenilaian() {
        return penilaian;
    }

    public void setPenilaian(String penilaian) {
        this.penilaian = penilaian;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nama_tempat);
        parcel.writeString(this.daerah);
        parcel.writeString(this.photo);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.penilaian);
        parcel.writeString(this.jam);

    }
}
