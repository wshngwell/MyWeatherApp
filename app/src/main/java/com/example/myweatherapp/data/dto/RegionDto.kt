package com.example.myweatherapp.data.dto

import com.google.gson.annotations.SerializedName

data class RegionDto(
    @SerializedName("id") val id :Int,
    @SerializedName("name") val name :String,
    @SerializedName("country") val country :String,
)
