package com.example.myweatherapp.presentation.details

import com.arkivanov.decompose.ComponentContext

class DefaultDetailsComponent(
    private val component: ComponentContext
) : DetailsComponent, ComponentContext by component