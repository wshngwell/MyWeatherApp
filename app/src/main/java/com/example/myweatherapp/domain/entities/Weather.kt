package com.example.myweatherapp.domain.entities

import java.util.Calendar

data class Weather(
    val tempC: Float,
    val conditionTemp: String,
    val weatherIconUrl: String,
    val date: Calendar
)