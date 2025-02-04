package com.example.myweatherapp.data.dto

import com.google.gson.annotations.SerializedName

data class ForecastDayListDto(
    @SerializedName("forecastday") val listOfForecastDayDto: List<ForecastDayDto>
)
