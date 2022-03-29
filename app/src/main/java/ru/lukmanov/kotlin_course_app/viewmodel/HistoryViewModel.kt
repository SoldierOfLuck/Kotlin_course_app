package ru.lukmanov.kotlin_course_app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.lukmanov.kotlin_course_app.App.Companion.getHistoryDao
import ru.lukmanov.kotlin_course_app.repository.LocalRepository
import ru.lukmanov.kotlin_course_app.repository.LocalRepositoryImpl

class HistoryViewModel(
    val historyLiveData: MutableLiveData<AppState> = MutableLiveData(),
    private val historyRepository: LocalRepository =
        LocalRepositoryImpl(getHistoryDao())) : ViewModel() {
    fun getAllHistory() {
        historyLiveData.value = AppState.Loading
        historyLiveData.value =
            AppState.Success(historyRepository.getAllHistory())
    }
}