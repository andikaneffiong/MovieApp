package com.example.movieapp.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieapp.Adapters.RecyclerAdapter
import com.example.movieapp.ItemClass.NewReleaseItem
import com.example.movieapp.R
import kotlinx.android.synthetic.main.fragment_movies.*
import kotlinx.android.synthetic.main.fragment_show.*

class ShowFragment : Fragment(R.layout.fragment_show) {


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)


            val longestRide:Int =  R.drawable.longest_ride
            val blacklist:Int = R.drawable.blacklist
            val haunting:Int  = R.drawable.haunting
            val adama:Int  = R.drawable.adada
            val showmovies: List<NewReleaseItem> =  listOf(

                    NewReleaseItem(longestRide,"Longest Ride"),
                    NewReleaseItem(blacklist,"BlackList"),
                    NewReleaseItem(haunting,"Haunting"),
                    NewReleaseItem(adama,"Adada"),
            )




            rv_movies_fragment_show.adapter = RecyclerAdapter(showmovies)

            rv_movies_fragment_show.layoutManager = GridLayoutManager(requireContext(), 1,GridLayoutManager.HORIZONTAL,false)

            rv_movies_fragment_show.setHasFixedSize(true)

            recyclerView_show.adapter = RecyclerAdapter(showmovies)
            recyclerView_show.layoutManager = GridLayoutManager(requireContext(), 1,GridLayoutManager.HORIZONTAL,false)
            recyclerView_show.setHasFixedSize(true)

        }






}