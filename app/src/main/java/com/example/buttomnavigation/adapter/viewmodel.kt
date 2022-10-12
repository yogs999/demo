package com.example.buttomnavigation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.buttomnavigation.R
import com.example.buttomnavigation.dashboard

class viewmodel(val context: Context, val list: List<Course>) : RecyclerView.Adapter<viewmodel.ViewHolder>() {

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        val name=itemView.findViewById<TextView>(R.id.namee)
        val img=itemView.findViewById<ImageView>(R.id.img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val article=list[position]
        holder.name.text=article.topic
        holder.img.setImageResource(article.img)
        }

    override fun getItemCount(): Int {
       return list.size
    }
}