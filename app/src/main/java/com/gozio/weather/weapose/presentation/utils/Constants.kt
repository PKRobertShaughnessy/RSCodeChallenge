package com.gozio.weather.weapose.presentation.utils

import com.google.android.gms.maps.model.LatLng

object Constants {
    object DateFormat {
        const val HH_mm = "HH:mm"
        const val EE_MM_dd = "EEEE, MMM dd"
    }

    object Key {
        const val LAT_LNG = "lat_lng"
        const val LAT = "lat"
        const val LNG = "lng"
        const val FROM_ROUTE = "from_route"
        const val ADDRESS_NAME = "address_name"
    }

    object Default {
        val LAT_LNG_DEFAULT = LatLng(33.78591032377107, -84.40964058633683)
        const val BASE_URL_OPEN_WEATHER = "https://api.openweathermap.org/data/2.5/WEATHER"
        val CURRENT_WEATHER =  "/data/2.5/weather"
    //?lat=33.78591032377107&lon=-84.40964058633683&appid=3aa158b2f14a9f493a8c725f8133d704&units=imperial"
    }
    //{"coord":{"lon":-84.4096,"lat":33.7859},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"base":"stations","main":{"temp":55.94,"feels_like":53.73,"temp_min":50.09,"temp_max":59.09,"pressure":1017,"humidity":53},"visibility":10000,"wind":{"speed":8.05,"deg":330},"clouds":{"all":0},"dt":1677984191,"sys":{"type":2,"id":2006620,"country":"US","sunrise":1677931375,"sunset":1677972972},"timezone":-18000,"id":4196508,"name":"Fulton","cod":200}

}
