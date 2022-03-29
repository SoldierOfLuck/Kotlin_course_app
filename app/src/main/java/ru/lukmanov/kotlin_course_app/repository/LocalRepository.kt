package ru.lukmanov.kotlin_course_app.repository

import ru.lukmanov.kotlin_course_app.model.Weather

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}