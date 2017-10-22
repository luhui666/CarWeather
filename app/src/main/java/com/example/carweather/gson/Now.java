package com.example.carweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 芦荟 on 2017/10/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
