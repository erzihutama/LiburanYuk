package com.erzihutama.liburanyuk.model;

import java.util.HashMap;
import java.util.Map;

public class BudayaItem {



    private String id_budaya;
    private String nama_tempat;
    private String daerah;
    private String photo;
    private String deskripsi;
    private String penilaian;
    private String jam;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId_budaya() {
        return id_budaya;
    }

    public void setId_budaya(String id_budaya) {
        this.id_budaya = id_budaya;
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
}
