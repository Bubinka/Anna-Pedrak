package com.example.dinnerrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_main.*


import java.util.*


class MainActivity : AppCompatActivity() {

    //initialize variables

    val foodList = arrayListOf("Chinese","Hamburger","Pizza","McDonalds","Barros Pizza","Mexico")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {

            val random = Random()
            val randomFood = random.nextInt(foodList.count())

            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            println(foodList)
        }
    }
}