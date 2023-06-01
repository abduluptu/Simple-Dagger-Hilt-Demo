package com.abdul.simpledaggerhiltdemo.common

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

object Util {

    fun isInternetAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        // For devices running Android Q and above
        val network = connectivityManager.activeNetwork
        val networkCapabilities = connectivityManager.getNetworkCapabilities(network)
        return networkCapabilities?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) == true

        // For devices running below Android Q
        // val networkInfo = connectivityManager.activeNetworkInfo
        // return networkInfo != null && networkInfo.isConnected
    }

}