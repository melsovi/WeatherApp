package com.company.weatherapp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.company.weatherapp.common.Resource;
import com.company.weatherapp.data.model.WeatherApp;
import com.company.weatherapp.data.repositories.MainRepositoryImpl;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class WeatherViewModel extends ViewModel {

    public LiveData<Resource<WeatherApp>> liveData;
    private MainRepositoryImpl repository;

    public WeatherViewModel() {}

    @Inject
    public WeatherViewModel(MainRepositoryImpl repository) {
        this.repository = repository;
    }

    public void getWeatherByCityName(String cityName) {
        liveData = repository.getWeatherByCityName(cityName);
    }
}
