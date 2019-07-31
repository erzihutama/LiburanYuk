package com.erzihutama.liburanyuk.model;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterModel {

    private String result;
    private List<EnterItem> item = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<EnterItem> getItem() {
        return item;
    }

    public void setItem(List<EnterItem> item) {
        this.item = item;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}