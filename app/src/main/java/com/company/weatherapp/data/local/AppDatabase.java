package com.company.weatherapp.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.company.weatherapp.data.local.converters.CloudsConverter;
import com.company.weatherapp.data.local.converters.CoordConverter;
import com.company.weatherapp.data.local.converters.MainConverter;
import com.company.weatherapp.data.local.converters.SysConverter;
import com.company.weatherapp.data.local.converters.WeatherConverter;
import com.company.weatherapp.data.local.converters.WindConverter;
import com.company.weatherapp.data.model.WeatherApp;

@Database(entities = {WeatherApp.class}, version = 1, exportSchema = false)
@TypeConverters({MainConverter.class, WindConverter.class, SysConverter.class,
        WeatherConverter.class, CloudsConverter.class, CoordConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract WeatherDao weatherDao();
}
