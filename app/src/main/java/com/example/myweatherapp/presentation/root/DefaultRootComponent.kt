package com.example.myweatherapp.presentation.root

import com.arkivanov.decompose.ComponentContext

class DefaultRootComponent (
    private val component: ComponentContext
) : RootComponent, ComponentContext by component