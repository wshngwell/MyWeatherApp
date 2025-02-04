package com.example.myweatherapp.data.dto

import com.google.gson.annotations.SerializedName

data class WeatherDto(
    @SerializedName("last_updated_epoch") val date: Long,
    @SerializedName("temp_c") val tempC: Double,
    @SerializedName("condition") val condition: ConditionDto,
    )
