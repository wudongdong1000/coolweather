package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名:     CoolWeather
 * 包名:       com.example.coolweather.db
 * 文件名:     County
 * 创建者:     吴冬冬
 * 创建时间:   2017/6/916:50
 * 描述:       TODO
 */

public class County extends DataSupport {
    private  int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
