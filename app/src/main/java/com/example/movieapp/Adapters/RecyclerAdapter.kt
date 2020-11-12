package com.example.movieapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.ItemClass.NewReleaseItem
import com.example.movieapp.R

class RecyclerAdapter(private val exampleList: List<com.example.movieapp.ItemClass.NewReleaseItem>) : RecyclerView.Adapter<RecyclerAdapter.NewReleaseItem>(){



   inner class  NewReleaseItem(itemView:View): RecyclerView.ViewHolder(itemView) {


        val imageView: ImageView = itemView.findViewById(R.id.image_recycler_item_release)
        val textView: TextView = itemView.findViewById(R.id.recycler_textview_item_release)

       init {
           itemView.setOnClickListener {
             itemView.findNavController().navigate(R.id.action_mainFragment_to_movieDetailsFragment)
           }
       }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewReleaseItem {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_new_release,parent,false)

        return  NewReleaseItem(layout)

    }

    override fun onBindViewHolder(holder: NewReleaseItem, position: Int) {
        val currentItem = exampleList[position].image
        val name = exampleList[position].movieName
        holder.apply {
            imageView.setImageResource(currentItem)
            textView.text = name

        }

    }

    override fun getItemCount() :Int{
        return  exampleList.size
    }







}