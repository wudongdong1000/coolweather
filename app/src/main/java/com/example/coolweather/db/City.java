package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名:     CoolWeather
 * 包名:       com.example.coolweather.db
 * 文件名:     City
 * 创建者:     吴冬冬
 * 创建时间:   2017/6/916:48
 * 描述:       TODO
 */

public class City extends DataSupport {
    private  int id;
    private  String cityName;
    private  int cityCode;
    private  int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
