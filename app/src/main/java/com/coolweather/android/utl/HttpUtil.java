package com.coolweather.android.utl;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request
                .Builder()
                .url(address)
                .build();
        //okhttp的出色封装
        // 只需调用sendOkHttpRequest方法
        // 传入请求地址,并注册一个回调来处理服务器响应就可以了
        client.newCall(request).enqueue(callback);
    }
}
