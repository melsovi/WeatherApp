package com.company.weatherapp.data.local.converters;


import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import com.company.weatherapp.data.model.Main;

public class MainConverter {

    @TypeConverter
    public String fromMainToString(Main main){
        if (main == null){
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Main>(){}.getType();
        return gson.toJson(main,type);
    }
    @TypeConverter
    public Main fromStringToMain(String fromString){
        if (fromString == null){
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Main>(){}.getType();
        return gson.fromJson(fromString,type);
    }
}