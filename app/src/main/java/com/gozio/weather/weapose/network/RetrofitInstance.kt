package com.gozio.weather.weapose.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Open Weather API endpoint:
//https://api.openweathermap.org/data/2.5/weather?lat=33.78591032377107&lon=-84.40964058633683&appid=3aa158b2f14a9f493a8c725f8133d704&units=imperial
object RetrofitInstance {

    val api: WeatherAPI by lazy {
        // a single instance of Retrofit for the api
        Retrofit.Builder()
            .baseUrl(WeatherAPI.baseWeatherApiUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherAPI::class.java)
    }

}