package com.renguanyu.tool.geocoding.model;

import java.util.List;

public class Geo {

    private String status;
    private String count;
    private String info;
    private List<Geocode> geocodes;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Geocode> getGeocodes() {
        return geocodes;
    }

    public void setGeocodes(List<Geocode> geocodes) {
        this.geocodes = geocodes;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "status='" + status + '\'' +
                ", count='" + count + '\'' +
                ", info='" + info + '\'' +
                ", geocodes=" + geocodes +
                '}';
    }
}
