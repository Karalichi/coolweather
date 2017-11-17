package com.baosight.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by saitama on 2017/11/17.
 */
public class County extends DataSupport {
    private int id;
    private String countyName;
    private int countyCode;
    private int cityCode;

    public int getId() {
        return id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
