package com.example.myweatherapp.domain.usecases.weatherusecases

import com.example.myweatherapp.domain.entities.City
import com.example.myweatherapp.domain.repositories.WeatherRepository
import javax.inject.Inject

data class GetWeatherUseCase @Inject constructor(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(citId: Int) = repository.getWeather(citId)
}
