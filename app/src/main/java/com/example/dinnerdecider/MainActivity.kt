package com.example.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "KFC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val randomFood = Random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            if(!addFoodTxt.text.isEmpty()){
                val newFood = addFoodTxt.text.toString()
                foodList.add(newFood)
                addFoodTxt.text.clear()
            }
            Toast.makeText(this,foodList.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}
