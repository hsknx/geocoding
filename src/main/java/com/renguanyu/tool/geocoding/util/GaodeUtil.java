package com.renguanyu.tool.geocoding.util;

import com.alibaba.fastjson.JSONObject;
import com.renguanyu.tool.geocoding.model.Geo;

import java.util.HashMap;
import java.util.Map;

public class GaodeUtil {

    public static final String HTTP_RESTAPI_AMAP_COM_V3_GEOCODE_GEO = "https://restapi.amap.com/v3/geocode/geo";
//    public static final String D99A48C63B9FE9A1382EFCC42359AB = "31ce20ad0cf0a8e3332bdffca7202a41";
    private String key;

    public GaodeUtil(){

    }
    public GaodeUtil(String key){
        this.key = key;
    }
    public JSONObject geoJson(String address,String city) {
        Map<String,String> map = new HashMap<>();
        map.put("address", address);
        map.put("city", city);
        map.put("key", this.key);
        JSONObject json = HttpUtil.postMap(HTTP_RESTAPI_AMAP_COM_V3_GEOCODE_GEO, map);
        return json;
    }
    public JSONObject geoJson(String address) {
        Map<String,String> map = new HashMap<>();
        map.put("address", address);
        map.put("key", this.key);
        JSONObject json = HttpUtil.postMap(HTTP_RESTAPI_AMAP_COM_V3_GEOCODE_GEO, map);
        return json;
    }

    public Geo geo(String address, String city) {
        Map<String,String> map = new HashMap<>();
        map.put("address", address);
        map.put("city", city);
        map.put("key", this.key);
        JSONObject json = HttpUtil.postMap(HTTP_RESTAPI_AMAP_COM_V3_GEOCODE_GEO, map);
        Geo geo = getGeo(json);
        return geo;
    }
    public Geo geo(String address) {
        Map<String,String> map = new HashMap<>();
        map.put("address", address);
        map.put("key", this.key);
        JSONObject json = HttpUtil.postMap(HTTP_RESTAPI_AMAP_COM_V3_GEOCODE_GEO, map);
        Geo geo = getGeo(json);
        return geo;
    }

    private Geo getGeo(JSONObject json) {
        Geo geo = null;
        if(json!=null){
            String jsonString = json.toString();
            geo = JSONObject.parseObject(jsonString,Geo.class);
        }
        return geo;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
