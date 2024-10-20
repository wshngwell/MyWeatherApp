package com.example.myweatherapp.presentation.favourite

import com.arkivanov.decompose.ComponentContext

class DefaultFavouriteComponent(
    private val component: ComponentContext
) : FavouriteComponent, ComponentContext by component