package com.abdul.simpledaggerhiltdemo.data.repository

import com.abdul.simpledaggerhiltdemo.data.model.Cryptocurrency

//Step7: create Repository interface

interface CryptocurrencyRepository {

    fun getCryptoCurrency(): List<Cryptocurrency>
}