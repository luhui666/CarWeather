package com.example.carweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 芦荟 on 2017/10/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public  Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
