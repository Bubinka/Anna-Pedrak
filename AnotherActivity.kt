package com.example.sportdiscipline

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.ActionBar
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_another.*

class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val actionBar:ActionBar?= supportActionBar
        actionBar !!.setDisplayHomeAsUpEnabled(true)
        actionBar !!.setDisplayShowHomeEnabled(true)

        //get data from putExtra

        var intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aDescription = intent.getStringExtra("iDescription")
        val aImageView = intent.getIntExtra("ImageView",0)

        //set title in another activity

        actionBar.setTitle(aTitle)
        a_title.text = aTitle
        a_description.text = aDescription

        imageView.setImageResource(aImageView)
    }
}//end class AnotherActivity