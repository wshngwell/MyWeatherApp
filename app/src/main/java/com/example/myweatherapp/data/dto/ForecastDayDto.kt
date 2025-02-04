package com.example.myweatherapp.data.dto

import com.google.gson.annotations.SerializedName

data class ForecastDayDto(
    @SerializedName("date_epoch") val date: Long,
    @SerializedName("day") val day: ForecastDto,
)
