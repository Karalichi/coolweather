package com.baosight.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by saitama on 2017/11/17.
 */
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
