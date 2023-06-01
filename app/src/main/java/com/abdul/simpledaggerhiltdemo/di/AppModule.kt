package com.abdul.simpledaggerhiltdemo.di

import com.abdul.simpledaggerhiltdemo.data.repository.CryptocurrencyImpl
import com.abdul.simpledaggerhiltdemo.data.repository.CryptocurrencyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//Step9: create module class, It provides Repository instance

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideCryptoCurrencyRepository(): CryptocurrencyRepository = CryptocurrencyImpl()
}