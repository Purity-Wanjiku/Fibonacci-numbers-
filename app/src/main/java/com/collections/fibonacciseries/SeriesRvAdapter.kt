package com.collections.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NamesRvAdapter(var namesList: String): RecyclerView.Adapter<NamesViewHolder>(){

//    private val fibonacciList = generateFibonacciNumbers(100)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val currentName=namesList.get(position)
        holder.tvNames.text= currentName.toString()
    }

    override fun getItemCount(): Int {
        return namesList.length
    }

}

class NamesViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    var tvNames: TextView =itemView.findViewById<TextView>(R.id.tvName)
}
