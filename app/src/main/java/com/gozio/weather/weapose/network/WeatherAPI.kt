package com.gozio.weather.weapose.network
import com.gozio.weather.weapose.data.model.Weather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherAPI {
    @GET("data/2.5/weather?")
    suspend fun getCurrentWeather(@Query("lat") lat: Double, @Query("lon") lon: Double,
                          @Query("appid") app_id: String,
                          @Query("units") unitOfMeasure : String): Response<Weather>






    companion object {
        const val baseWeatherApiUrl = "https://api.openweathermap.org"
        const val locationLatitude = 33.78591032377107
        const val locationLongitude = -84.40964058633683
        const val unitOfMeasure = "imperial"
        const val appId = "3aa158b2f14a9f493a8c725f8133d704"
    }

}

/*
{
   "coord":{
      "lon":-84.4129,
      "lat":33.786
   },
   "weather":[
      {
         "id":801,
         "main":"Clouds",
         "description":"few clouds",
         "icon":"02d"
      }
   ],
   "base":"stations",
   "main":{
      "temp":66.61,
      "feels_like":66.4,
      "temp_min":63.97,
      "temp_max":68.54,
      "pressure":1017,
      "humidity":73
   },
   "visibility":10000,
   "wind":{
      "speed":11.5,
      "deg":320,
      "gust":24.16
   },
   "clouds":{
      "all":20
   },
   "dt":1678198975,
   "sys":{
      "type":2,
      "id":2006620,
      "country":"US",
      "sunrise":1678190346,
      "sunset":1678232318
   },
   "timezone":-18000,
   "id":4196508,
   "name":"Fulton",
   "cod":200
}
 */