package com.example.myweatherapp.data.dto

import com.google.gson.annotations.SerializedName

data class ForecastAnswerDto(
    @SerializedName("current") val current: WeatherDto,
    @SerializedName("forecast") val forecastDayListDto: ForecastDayListDto
)
