package com.example.myweatherapp.data.dto

import com.google.gson.annotations.SerializedName

data class ForecastDto(
    @SerializedName("avgtemp_c") val tempC: Double,
    @SerializedName("condition") val conditionDto: ConditionDto,
)
