package com.abdul.simpledaggerhiltdemo.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdul.simpledaggerhiltdemo.R
import com.abdul.simpledaggerhiltdemo.common.Util
import com.abdul.simpledaggerhiltdemo.data.model.Cryptocurrency
import com.abdul.simpledaggerhiltdemo.ui.adapter.CryptocurrencyAdapter
import com.abdul.simpledaggerhiltdemo.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

//Step12: pass data to Adapter to display list

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var cryptocurrencyList: RecyclerView
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cryptocurrencyList = findViewById(R.id.cryptoCurrencyList)
        cryptocurrencyList.layoutManager = LinearLayoutManager(this)

        val isConnected = Util.isInternetAvailable(this)
        if (isConnected) {
            observeCryptoCurrency()
        } else {
            Toast.makeText(this, "Internet is not connected", Toast.LENGTH_SHORT).show()
        }

    }

    private fun observeCryptoCurrency() {
        viewModel.cryptoCurrency.observe(this, Observer {
            cryptocurrencyList.adapter = CryptocurrencyAdapter(it)
        })
    }
}