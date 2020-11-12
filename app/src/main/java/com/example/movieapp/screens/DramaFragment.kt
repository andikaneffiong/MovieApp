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
import kotlinx.android.synthetic.main.fragment_drama.*
import kotlinx.android.synthetic.main.fragment_movies.*

class DramaFragment : Fragment(R.layout.fragment_drama) {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drama, container, false)
    }


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val longestRide:Int =  R.drawable.longest_ride
            val blacklist:Int = R.drawable.blacklist
            val haunting:Int  = R.drawable.haunting
            val adama:Int  = R.drawable.adada
            val movies: List<NewReleaseItem> =  listOf(

                    NewReleaseItem(longestRide,"Longest Ride"),
                    NewReleaseItem(blacklist,"BlackList"),
                    NewReleaseItem(haunting,"Haunting"),
                    NewReleaseItem(adama,"Adada"),
            ).shuffled()




           rv_drama_fragment1.adapter = RecyclerAdapter(movies)

            rv_drama_fragment1.layoutManager = GridLayoutManager(requireContext(), 1,GridLayoutManager.HORIZONTAL,false)

            rv_drama_fragment1.setHasFixedSize(true)

            recyclerView_drama2.adapter = RecyclerAdapter(movies)
            recyclerView_drama2.layoutManager = GridLayoutManager(requireContext(), 1,GridLayoutManager.HORIZONTAL,false)
            recyclerView_drama2.setHasFixedSize(true)

        }




}