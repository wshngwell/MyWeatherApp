package com.example.myweatherapp.domain.repositories

import com.example.myweatherapp.domain.entities.Forecast
import com.example.myweatherapp.domain.entities.Weather

interface WeatherRepository {

   suspend fun getWeather(cityId: Int): Weather
   suspend fun getForecast(cityId: Int): Forecast
}