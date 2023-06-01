package com.abdul.simpledaggerhiltdemo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.abdul.simpledaggerhiltdemo.data.model.Cryptocurrency
import com.abdul.simpledaggerhiltdemo.data.repository.CryptocurrencyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//Step9: create ViewModel class and access Repository

@HiltViewModel
class MainViewModel @Inject constructor(private val cryptocurrencyRepository: CryptocurrencyRepository) :
    ViewModel() {

    private val cryptocurrencyList = MutableLiveData<List<Cryptocurrency>>()

    val cryptoCurrency: LiveData<List<Cryptocurrency>> = cryptocurrencyList

    init {
        loadCryptocurrency()
    }

    private fun loadCryptocurrency() {
        cryptocurrencyList.value = cryptocurrencyRepository.getCryptoCurrency()
    }
}