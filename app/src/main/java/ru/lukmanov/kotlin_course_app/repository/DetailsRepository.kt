package ru.lukmanov.kotlin_course_app.repository

import ru.lukmanov.kotlin_course_app.model.WeatherDTO


interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: retrofit2.Callback<WeatherDTO>
    )
}