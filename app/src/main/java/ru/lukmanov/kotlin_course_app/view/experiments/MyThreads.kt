package ru.lukmanov.kotlin_course_app.view.experiments

import android.os.Looper

class MyThread : Thread() {
    override fun run() {
        Looper.prepare()
        Looper.loop()
    }
}