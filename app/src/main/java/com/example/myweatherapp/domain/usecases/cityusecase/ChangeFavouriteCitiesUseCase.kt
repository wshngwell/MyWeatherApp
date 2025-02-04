package com.example.myweatherapp.domain.usecases.cityusecase

import com.example.myweatherapp.domain.entities.City
import com.example.myweatherapp.domain.repositories.CityRepository
import javax.inject.Inject

data class ChangeFavouriteCitiesUseCase @Inject constructor(
    private val repository: CityRepository
) {
    suspend fun addCityToFavourite(city: City) = repository.addCityToFavourite(city)
    suspend fun removeCityFromFavourite(cityId: Int) = repository.removeCityFromFavourite(cityId)
}