package com.example.myweatherapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myweatherapp.data.ApiFactory
import com.example.myweatherapp.presentation.ui.theme.MyWeatherAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val apiService = ApiFactory.apiService
        CoroutineScope(Dispatchers.Main).launch {
            val current = apiService.getCurrentWeather("minsk")
            val forecast = apiService.getForecast("minsk")
            val search = apiService.getCity("moscow")

            Log.d("MainActivity", current.toString())
            Log.d("MainActivity", forecast.toString())
            Log.d("MainActivity", search.toString())
        }

        setContent {
            MyWeatherAppTheme {

            }
        }
    }
}