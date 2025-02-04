package com.example.myweatherapp.data

import com.example.myweatherapp.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiFactory {
    private const val BASE_URL = "https://api.weatherapi.com/v1/"

    private const val KEY = "key"
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor {
            val oldRequest = it.request()
            val newUrl = oldRequest
                .url()
                .newBuilder()
                .addQueryParameter(KEY, BuildConfig.API_KEY)
                .build()

            val newRequest = oldRequest.newBuilder()
                .url(newUrl)
                .build()
            it.proceed(newRequest)
        }.build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ApiService = retrofit.create()

}