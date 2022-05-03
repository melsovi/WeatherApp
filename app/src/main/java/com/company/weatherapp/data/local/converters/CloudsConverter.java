package com.company.weatherapp.data.local.converters;


import android.arch.persistence.room.TypeConverter;

import com.company.weatherapp.data.model.Clouds;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class CloudsConverter {
    @TypeConverter
    public String fromCloudsToString(Clouds main){
        if (main == null){
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Clouds>(){}.getType();
        return gson.toJson(main,type);
    }
    @TypeConverter
    public Clouds fromStringToClouds(String fromString){
        if (fromString == null){
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Clouds>(){}.getType();
        return gson.fromJson(fromString,type);
    }
}