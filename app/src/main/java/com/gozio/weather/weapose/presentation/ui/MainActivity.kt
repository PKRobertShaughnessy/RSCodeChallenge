package com.gozio.weather.weapose.presentation.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.gozio.weather.weapose.network.RetrofitInstance
import com.gozio.weather.weapose.network.WeatherAPI
import com.gozio.weather.weapose.presentation.theme.WeaposeTheme
import okhttp3.OkHttpClient
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException

const val TAG = "MainActivity"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launchWhenCreated {

            val currentWeather = try {
                RetrofitInstance.api.getCurrentWeather(
                    WeatherAPI.locationLatitude,
                    WeatherAPI.locationLongitude,
                    WeatherAPI.appId,
                    WeatherAPI.unitOfMeasure
                )
            } catch (e: IOException) {
                Timber.tag(TAG)
                    .e("%s%s", "IOException, you might not have internet connection\n", e.message)
                return@launchWhenCreated
            } catch (e: HttpException) {
                Timber.tag(TAG).e("HttpException, unexpected response")
                return@launchWhenCreated
            }
            if(currentWeather.isSuccessful && currentWeather.body() != null) {
                // update from model
                println("currentWeather:Body\n+currentWeather.body()")
            } else {
                Timber.tag(TAG).e("Response not successful")
            }

        }

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            WeaposeTheme {
                WeatherApp()
            }
        }

    }
}
