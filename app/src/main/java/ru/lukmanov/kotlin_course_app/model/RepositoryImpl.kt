package ru.lukmanov.kotlin_course_app.model

class RepositoryImpl: Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorage(): Weather {
        return Weather()
    }


}