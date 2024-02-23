package com.example.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.databinding.ActivityDetailsBinding
import com.example.lab1.model.Pizza


class DetailsActivity : AppCompatActivity() {

    companion object {
        const val KEY_RESULT = "KeyResult"
    }

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pizza = intent.getSerializableExtra(KEY_RESULT)
        if(pizza is Pizza){
            binding.image.setImageResource(pizza.imageRes)
            binding.desc.text = pizza.description
            binding.price.text = pizza.price.toString()
            binding.name.text = pizza.name
        }
        binding.small.setOnClickListener{
            if(pizza is Pizza){
                binding.price.text = (pizza.price).toString()
            }
        }
        binding.mid.setOnClickListener{
            if(pizza is Pizza){
                binding.price.text = (pizza.price + 200).toString()
            }
        }
        binding.large.setOnClickListener{
            if(pizza is Pizza){
                binding.price.text = (pizza.price + 500).toString()
            }
        }
    }
}