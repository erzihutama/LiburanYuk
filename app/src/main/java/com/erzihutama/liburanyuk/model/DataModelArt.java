package com.erzihutama.liburanyuk.model;

import android.os.Parcel;
import android.os.Parcelable;

public class DataModelArt implements Parcelable {
    private String name, remarks, photo, deskripsi, jam, penilaian;

    protected DataModelArt(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
        jam = in.readString();
        penilaian = in.readString();
    }

    public static final Creator<DataModelArt> CREATOR = new Creator<DataModelArt>() {
        @Override
        public DataModelArt createFromParcel(Parcel in) {
            return new DataModelArt(in);
        }

        @Override
        public DataModelArt[] newArray(int size) {
            return new DataModelArt[size];
        }
    };

    public DataModelArt() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public String getjam() {
        return jam;
    }

    public void setjam(String jam) {
        this.jam = jam;
    }

    public String getpenilaian() {
        return penilaian;
    }

    public void setpenilaian(String penilaian) {
        this.penilaian = penilaian;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.remarks);
        parcel.writeString(this.photo);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.jam);
        parcel.writeString(this.penilaian);
    }
}
