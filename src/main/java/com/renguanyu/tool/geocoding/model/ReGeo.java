package com.renguanyu.tool.geocoding.model;

import java.util.Arrays;

public class ReGeo {

    String infocode;
    String [] regeocode;


    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public String[] getRegeocode() {
        return regeocode;
    }

    public void setRegeocode(String[] regeocode) {
        this.regeocode = regeocode;
    }

    @Override
    public String toString() {
        return "ReGeo{" +
                "infocode='" + infocode + '\'' +
                ", regeocode=" + Arrays.toString(regeocode) +
                '}';
    }
}
