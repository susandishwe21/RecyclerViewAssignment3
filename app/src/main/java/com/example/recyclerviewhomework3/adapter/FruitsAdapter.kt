package com.example.recyclerviewhomework3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework3.R
import com.example.recyclerviewhomework3.model.Fruits
import kotlinx.android.synthetic.main.item_fruits.view.*

class FruitsAdapter(var fruitsList : ArrayList<Fruits>)
    : RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>(){
    inner class FruitsViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView){

        fun bindFruits(fruits : Fruits){
            itemView.itemPicture.setImageResource(fruits.Picture)
            itemView.itemName.text = fruits.Name
            itemView.itemPrice.text = fruits.Price
            itemView.itemWeight.text= fruits.Weight
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fruits,parent,false)
        return FruitsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        holder.bindFruits(fruitsList[position])
    }
}
