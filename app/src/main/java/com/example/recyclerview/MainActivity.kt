package com.example.recyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
    val fruitsList = listOf<Fruit>(
        Fruit("Mango", "James"),
        Fruit("Banana", "James"),
        Fruit("Apple", "James"),
        Fruit("Pineapple", "James"),
        Fruit("Orange", "James"),
        Fruit("Melon", "James"),
        Fruit("Grapes", "James"),
        Fruit("Pear", "James"),
        Fruit("Nuts", "James"),
        Fruit("Peach", "James"),
    )

    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(fruitsList) { selectedItem: Fruit ->
            listItemClicekd(selectedItem)
        }

    }

    private fun listItemClicekd(fruit: Fruit)
    {
        Toast.makeText(
            this@MainActivity,
            "Fruit supplier is ${fruit.supplier}",
            Toast.LENGTH_LONG
        ).show()
    }
}