package com.company.weatherapp.domain.repository;

import androidx.lifecycle.MutableLiveData;

import com.company.weatherapp.common.Resource;
import com.company.weatherapp.data.model.WeatherApp;

public interface MainRepository {

    MutableLiveData<Resource<WeatherApp>> getWeatherByCityName(String cityName);
}
