package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lab1.adapter.PizzaAdapter
import com.example.lab1.databinding.ActivityMainBinding
import com.example.lab1.model.DataSource.pizzaList
import com.example.lab1.model.Pizza

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var adapter: PizzaAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = PizzaAdapter(onPizzaClick = {handlePizzaClick(it)})
        binding.container.adapter = adapter
        pizzaList = ArrayList(pizzaList)

        adapter?.submitList(ArrayList(pizzaList))



        binding.search.setOnClickListener{
            if(binding.edit.text.isEmpty()){
                Toast.makeText(this,"Search bar is empty!", Toast.LENGTH_SHORT).show()
                adapter?.submitList(ArrayList(pizzaList))
                return@setOnClickListener
            }
            var search_res = binding.edit.text.toString()
            var newList = pizzaList.filter{
                it.name.lowercase() == search_res.lowercase()
            }
            adapter?.submitList(ArrayList(newList))
        }

    }
    private fun handlePizzaClick(pizza: Pizza) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(DetailsActivity.KEY_RESULT , pizza)
        startActivity(intent)
    }
}