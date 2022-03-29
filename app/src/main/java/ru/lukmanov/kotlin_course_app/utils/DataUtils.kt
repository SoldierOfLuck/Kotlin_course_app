package ru.lukmanov.kotlin_course_app.utils

import ru.lukmanov.kotlin_course_app.model.*
import ru.lukmanov.kotlin_course_app.model.room.HistoryEntity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!! // !! - это риск!!!
    return listOf(Weather(getDefaultCity(), fact.temp!!, fact.feels_like!!, fact.condition!!,
        fact.pressure_mm!!, fact.humidity!!, fact.season!!, fact.icon
    ))
}

fun convertHistoryEntityToWeather(entityList: List<HistoryEntity>):
        List<Weather> {
    return entityList.map {
        Weather(City(it.city, 0.0, 0.0), it.temperature, 0, it.condition)
    }
}

fun convertWeatherToEntity(weather: Weather): HistoryEntity {
    return HistoryEntity(
        0, weather.city.city, weather.temperature,
        weather.condition
    )
}