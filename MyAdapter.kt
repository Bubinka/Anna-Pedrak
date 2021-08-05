package com.example.sportdiscipline

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(val arrayList: ArrayList<Model>, val context:Context): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindItems(model: Model) {
            itemView.descTv.text = model.desc
            itemView.descTv.text = model.desc
            itemView.imageView.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)
    }//

    override fun getItemCount(): Int {

        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindItems(arrayList[position])
        holder.itemView.setOnClickListener {

            if(position == 1) {

            }


            //get position of selected item
            val model = arrayList.get(position)
            var gTitle: String = model.title
            var gDescription: String = model.desc

            //get image Intent,which position is selected

            var gImageView: Int = model.image

            //create Intent in kotlin

            val intent = Intent(context, AnotherActivity::class.java)
            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iDesc", gDescription)
            intent.putExtra("iImageView", gImageView)
            context.startActivity(intent)
        }


    }

}//end class MyAdapter