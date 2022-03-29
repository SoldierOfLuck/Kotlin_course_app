package ru.lukmanov.kotlin_course_app.repository

import ru.lukmanov.kotlin_course_app.model.Weather
import ru.lukmanov.kotlin_course_app.model.room.HistoryDao
import ru.lukmanov.kotlin_course_app.utils.convertHistoryEntityToWeather
import ru.lukmanov.kotlin_course_app.utils.convertWeatherToEntity


class LocalRepositoryImpl(private val localDataSource: HistoryDao) :
    LocalRepository {
    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }
    override fun saveEntity(weather: Weather) {
        localDataSource.insert(convertWeatherToEntity(weather))
    }
}