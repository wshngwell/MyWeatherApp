package com.example.myweatherapp.domain.usecases.searchusecases

import com.example.myweatherapp.domain.repositories.SearchRepository
import javax.inject.Inject

data class SearchCityUseCase @Inject constructor
    (val repository: SearchRepository) {

    suspend operator fun invoke(query: String) = repository.searchCities(query)
}
