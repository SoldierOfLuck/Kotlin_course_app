package ru.lukmanov.kotlin_course_app.model

import ru.lukmanov.kotlin_course_app.R
import java.lang.reflect.Modifier.toString

data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = -7,
    val feelsLike: Int = -12,
    val humidity: Int = 86,
    val wind: Int = 11,
    val uv: String = "Low"
)

fun getDefaultCity() = City("Москва", 55.755826, 37.617299900000035)
