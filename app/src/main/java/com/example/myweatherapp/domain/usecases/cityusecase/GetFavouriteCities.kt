package com.example.myweatherapp.domain.usecases.cityusecase

import com.example.myweatherapp.domain.repositories.CityRepository
import javax.inject.Inject

data class GetFavouriteCities @Inject constructor(
    private val repository: CityRepository
) {
    operator fun invoke() = repository.getFavouriteCities()
}
