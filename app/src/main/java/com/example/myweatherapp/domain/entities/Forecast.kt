package com.example.myweatherapp.domain.entities

data class Forecast(
    val currentWeather: Weather,
    val upcoming: List<Weather>
)