package com.abdul.simpledaggerhiltdemo.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abdul.simpledaggerhiltdemo.R
import com.abdul.simpledaggerhiltdemo.data.model.Cryptocurrency
import com.abdul.simpledaggerhiltdemo.databinding.ListItemBinding
import com.bumptech.glide.Glide

//Step11: Create An Adapter Class

class CryptocurrencyAdapter(private val cryptocurrencyList: List<Cryptocurrency>) :
    RecyclerView.Adapter<CryptocurrencyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        /*val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)*/
        val view = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.bind(cryptocurrency[position])
        /*val item = cryptocurrencyList[position]
        holder.bind(item)*/
        holder.bind(cryptocurrencyList[position])
    }

    override fun getItemCount() = cryptocurrencyList.size


    class ViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: Cryptocurrency){
            binding.dataCryptoCurrency = item
        }
    }
}