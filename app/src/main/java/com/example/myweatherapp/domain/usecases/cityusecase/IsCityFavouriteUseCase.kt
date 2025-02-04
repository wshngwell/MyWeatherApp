package com.example.myweatherapp.domain.usecases.cityusecase

import com.example.myweatherapp.domain.entities.City
import com.example.myweatherapp.domain.repositories.CityRepository
import javax.inject.Inject

data class IsCityFavouriteUseCase @Inject constructor(
    private val repository: CityRepository
) {
    operator fun invoke(city: City) = repository.isCityFavourite(city)
}