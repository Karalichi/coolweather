package com.baosight.coolweather.util;

import okhttp3.Address;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by saitama on 2017/11/17.
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
