package com.example.myweatherapp.domain.usecases.weatherusecases

import com.example.myweatherapp.domain.repositories.WeatherRepository
import javax.inject.Inject

data class GetForecastUseCase @Inject constructor(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(cityId: Int) = repository.getForecast(cityId)
}
