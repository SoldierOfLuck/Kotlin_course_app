package ru.lukmanov.kotlin_course_app.model

class RepositoryImpl: Repository {
    override fun getWeatherFromLocalStorage() = Weather()

    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}