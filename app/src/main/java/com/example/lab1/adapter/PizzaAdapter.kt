package com.example.lab1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.databinding.ItemPizzaBinding
import com.example.lab1.model.DiffUtil
import com.example.lab1.model.Pizza

class PizzaAdapter(
    private val onPizzaClick : (Pizza) -> Unit
    ) : ListAdapter<Pizza , PizzaAdapter.ViewHolder>(DiffUtil()) {


    companion object {
        private const val PIZZA_ADAPTER_TAG = "PizzaAdapter"
    }

    inner class ViewHolder(
        private val binding : ItemPizzaBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(pizza : Pizza){
            with(binding){
                pizzaImage.setImageResource(pizza.imageRes)
                pizzaName.text = pizza.name
                pizzaDesc.text = pizza.description
                pizzaPrice.text = "от " + pizza.price.toString() + " KZT"


                root.setOnClickListener{
                    onPizzaClick(pizza)
                }
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPizzaBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}
