package com.example.qkobe.coolweather.util;

/**
 * Created by qkobe on 2016/9/5.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
