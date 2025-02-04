package com.example.myweatherapp.domain.repositories

import com.example.myweatherapp.domain.entities.City


interface SearchRepository {

   suspend fun searchCities(query: String): List<City>
}