package com.example.gridviewkotlin

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gridviewkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = arrayOf(
            "Java",
            "Kotlin",
            "C++",
            "Java Script",
            "PHP",
            "Java",
            "Kotlin",
            "C++",
            "Java Script",
            "PHP"
        )

        val image = intArrayOf(
            R.drawable.java,
            R.drawable.kotlin,
            R.drawable.cplusplus,
            R.drawable.js,
            R.drawable.php,
            R.drawable.java,
            R.drawable.kotlin,
            R.drawable.cplusplus,
            R.drawable.js,
            R.drawable.php
        )


        val gridAdapter = GridAdapter(this@MainActivity, name, image)
        binding.gridView.adapter = gridAdapter
//        binding.gridView.onItemClickListener =
//            OnItemClickListener { _, _, position, _ ->
//                Toast.makeText(
//                    this@MainActivity,
//                    "You click " + name[position],
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
    }

}