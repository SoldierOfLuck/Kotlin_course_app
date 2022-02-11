package ru.lukmanov.kotlin_course_app.viewmodel

import ru.lukmanov.kotlin_course_app.model.Weather

sealed class AppState{
    data class Success(val weatherData: Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
