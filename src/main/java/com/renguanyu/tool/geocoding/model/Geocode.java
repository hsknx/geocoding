package com.renguanyu.tool.geocoding.model;

public class Geocode {

    String formatted_address;
    String province;
    String city;
    String citycode;
    String district;
    String township;
    String street;
    String number;
    String adcode;
    String location;
    String lat;//y 纬
    String lng;//x 经
    String level;


    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;

        if(location!=null){
            String [] localtionStringArray = location.split(",");
            if(localtionStringArray!=null){
                if(localtionStringArray[0]!=null){
                    String lat = localtionStringArray[0];
                    this.lat = lat;
                }
                if(localtionStringArray[1]!=null){
                    String lng = localtionStringArray[1];
                    this.lng = lng;
                }


            }

        }

    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Geocode{" +
                "formatted_address='" + formatted_address + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", citycode='" + citycode + '\'' +
                ", district='" + district + '\'' +
                ", township='" + township + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", adcode='" + adcode + '\'' +
                ", location='" + location + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
