package com.baosight.coolweather.util;

import android.text.TextUtils;

import com.baosight.coolweather.db.City;
import com.baosight.coolweather.db.County;
import com.baosight.coolweather.db.Province;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by saitama on 2017/11/17.
 */
public class Utility {
    /**
     *解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allPro=new JSONArray(response);
                for(int i=0;i<allPro.length();i++){
                    JSONObject proObj=allPro.getJSONObject(i);
                    Province province=new Province();
                    province.setProvinceCode(proObj.getInt("id"));
                    province.setProvinceName(proObj.getString("name"));
                    province.save();

                }
                return true;

            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCityResponse(String response,int provinceCode){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCity=new JSONArray(response);
                for(int i=0;i<allCity.length();i++){
                    JSONObject cityObj=allCity.getJSONObject(i);
                    City city=new City();
                    city.setProvinceCode(provinceCode);
                    city.setCityCode(cityObj.getInt("id"));
                    city.setCityName(cityObj.getString("name"));
                    city.save();

                }
                return true;

            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCountyResponse(String response,int cityCode){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCounty=new JSONArray(response);
                for(int i=0;i<allCounty.length();i++){
                    JSONObject countyObj=allCounty.getJSONObject(i);
                    County county=new County();
                    county.setCityCode(cityCode);
                    county.setCountyCode(countyObj.getInt("id"));
                    county.setCountyName(countyObj.getString("name"));
                    county.save();
                }
                return true;

            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
