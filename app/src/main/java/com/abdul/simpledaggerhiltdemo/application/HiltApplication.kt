package com.abdul.simpledaggerhiltdemo.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Step4: create application class

@HiltAndroidApp
class HiltApplication : Application() {
}