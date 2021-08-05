package com.example.sportdiscipline

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()
        arrayList.add(Model("Skiing","skiing desc",R.drawable.skiing))
        arrayList.add(Model("Figure Skating","figure skating desc",R.drawable.figure_skating))
        arrayList.add(Model("Cycling","cycling desc",R.drawable.cycling))
        arrayList.add(Model("Football","football desc",R.drawable.football))
        arrayList.add(Model("Horse Racing","horse racing desc",R.drawable.horse_racing))
        arrayList.add(Model("Swimming","swimming desc",R.drawable.swimming))

        val myAdapter = MyAdapter(arrayList,this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

    }
}




