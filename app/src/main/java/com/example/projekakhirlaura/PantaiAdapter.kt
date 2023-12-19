package com.example.projekakhirlaura

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PantaiAdapter (val dataPantai:List<DataItem?>?) : RecyclerView.Adapter<PantaiAdapter.MyViewHolder>(){
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val judul = view.findViewById<TextView>(R.id.judul)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_mainv, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        if (dataPantai != null){
            return dataPantai.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.judul.text = dataPantai?.get(position)?.namaPantai

        /*holder.itemView.setOnClickListener{
            val nama = dataSayur?.get(position)?.nama
            Toast.makeText(holder.itemView.context, "${nama}", Toast.LENGTH_SHORT).show()
            }*/
    }

}