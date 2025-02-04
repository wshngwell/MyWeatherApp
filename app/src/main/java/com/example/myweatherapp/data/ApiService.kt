package com.example.myweatherapp.data

import com.example.myweatherapp.data.dto.ForecastAnswerDto
import com.example.myweatherapp.data.dto.RegionDto
import com.example.myweatherapp.data.dto.WeatherCurrentDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("current.json")
    suspend fun getCurrentWeather(
        @Query("q") city: String,
    ): WeatherCurrentDto


    @GET("forecast.json")
    suspend fun getForecast(
        @Query("q") city: String,
        @Query("days") days: Int = 4,
    ): ForecastAnswerDto


    @GET("search.json")
    suspend fun getCity(
        @Query("q") city: String,
    ): List<RegionDto>
}