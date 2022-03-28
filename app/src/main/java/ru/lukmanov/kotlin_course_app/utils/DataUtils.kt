package ru.lukmanov.kotlin_course_app.utils

import ru.lukmanov.kotlin_course_app.model.FactDTO
import ru.lukmanov.kotlin_course_app.model.Weather
import ru.lukmanov.kotlin_course_app.model.WeatherDTO
import ru.lukmanov.kotlin_course_app.model.getDefaultCity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!! // !! - это риск!!!
    return listOf(Weather(getDefaultCity(), fact.temp!!, fact.feels_like!!, fact.condition!!,
        fact.pressure_mm!!, fact.humidity!!, fact.season!!, fact.icon
    ))
}