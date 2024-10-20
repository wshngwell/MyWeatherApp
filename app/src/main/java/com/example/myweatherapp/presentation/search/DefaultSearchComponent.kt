package com.example.myweatherapp.presentation.search

import com.arkivanov.decompose.ComponentContext

class DefaultSearchComponent (
    private val component: ComponentContext
) : SearchComponent, ComponentContext by component