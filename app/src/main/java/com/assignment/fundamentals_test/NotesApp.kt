package com.assignment.fundamentals_test

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp(Application::class)
class NotesApp : Application() {
}