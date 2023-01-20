package com.example.chelseaxi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class adapter(val data:ArrayList<playersdata>): RecyclerView.Adapter<adapter.myviewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return myviewholder(view)
    }
    override fun getItemCount(): Int {
       return data.size
    }
    override fun onBindViewHolder(holder: myviewholder, position: Int) {
    val current=data[position]
        holder.titleimage.setImageResource(current.image)
        holder.text.text=current.heading
    }
    class myviewholder(itemView: View):RecyclerView.ViewHolder(itemView){
 val titleimage:ShapeableImageView = itemView.findViewById(R.id.imgview)
        val text:TextView = itemView.findViewById(R.id.textview)
    }
}