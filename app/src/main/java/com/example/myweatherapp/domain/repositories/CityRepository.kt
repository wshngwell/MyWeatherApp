package com.example.myweatherapp.domain.repositories

import com.example.myweatherapp.domain.entities.City
import kotlinx.coroutines.flow.Flow

interface CityRepository {

    fun getFavouriteCities(): Flow<City>

    fun isCityFavourite(city: City): Flow<Boolean>

   suspend fun addCityToFavourite(city: City)

   suspend fun removeCityFromFavourite(cityId: Int)
}