package com.example.movieapp.Adapters


import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.findNavController

import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R
import kotlinx.android.synthetic.main.aqua_item.view.*

class AquaImageAdapter (private val images: List<Int>) : RecyclerView.Adapter<AquaImageAdapter.AquaViewHolder>(){

    class AquaViewHolder (item:View):RecyclerView.ViewHolder(item){
        private val aquaImage : ImageView = item.findViewById(R.id.hero_image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AquaViewHolder {
       return AquaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.aqua_item,parent, false))

    }

    override fun onBindViewHolder(holder: AquaViewHolder, position: Int) {

       val image = images[position]
        holder.itemView.hero_image.setImageResource(image)
    }

    override fun getItemCount(): Int {

        return 4

    }


}