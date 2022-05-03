package com.company.weatherapp.data.local.converters;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import com.company.weatherapp.data.model.Weather;


public class WeatherConverter {

    @TypeConverter
    public String fromWeatherToString(List<Weather> main){
        if (main == null){
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<Weather>>(){}.getType();
        return gson.toJson(main,type);
    }
    @TypeConverter
    public List<Weather> fromStringToWeather(String fromString){
        if (fromString == null){
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<Weather>>(){}.getType();
        return gson.fromJson(fromString,type);
    }
}

