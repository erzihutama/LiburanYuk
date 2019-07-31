package com.erzihutama.liburanyuk.model;



import  java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterItem {

    private String nama_tempatenter;
    private String nama_tempat;
    private String daerahenter;
    private String photo;
    private String deskripsi;
    private String penilaian;
    private String jam;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNama_tempatenter() {
        return nama_tempatenter;
    }

    public void setNama_tempatenter(String nama_tempatenter) {
        this.nama_tempatenter = nama_tempatenter;
    }

    public String getNama_tempat() {
        return nama_tempat;
    }

    public void setNama_tempat(String nama_tempat) {
        this.nama_tempat = nama_tempat;
    }

    public String getDaerahenter() {
        return daerahenter;
    }

    public void setDaerahenter(String daerahenter) {
        this.daerahenter = daerahenter;
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


}