package com.company.weatherapp.data.local.converters;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import com.company.weatherapp.data.model.Coord;

public class CoordConverter {
    @TypeConverter
    public String fromCoordToString(Coord main){
        if (main == null){
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Coord>(){}.getType();
        return gson.toJson(main,type);
    }
    @TypeConverter
    public Coord fromStringToCoord(String fromString){
        if (fromString == null){
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Coord>(){}.getType();
        return gson.fromJson(fromString,type);
    }
}
