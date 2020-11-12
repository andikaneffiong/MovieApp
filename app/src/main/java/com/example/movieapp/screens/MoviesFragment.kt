package com.example.movieapp.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.GridLayout.HORIZONTAL
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieapp.Adapters.PageAdapter
import com.example.movieapp.Adapters.RecyclerAdapter
import com.example.movieapp.ItemClass.NewReleaseItem
import com.example.movieapp.R
import kotlinx.android.synthetic.main.fragment_movies.*
import kotlinx.android.synthetic.main.recycler_item_new_release.*


class  MoviesFragment : Fragment(R.layout.fragment_movies) {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment




        return inflater.inflate(R.layout.fragment_movies, container, false)




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




        recyclerView_movi.adapter = RecyclerAdapter(movies)

        recyclerView_movi.layoutManager = GridLayoutManager(requireContext(),  1, GridLayoutManager.HORIZONTAL, false)

        recyclerView_movi.setHasFixedSize(true)

        rv_movies_fragment1.adapter = RecyclerAdapter(movies)
        rv_movies_fragment1.layoutManager = GridLayoutManager(requireContext(),  1, GridLayoutManager.HORIZONTAL, false )
        rv_movies_fragment1.setHasFixedSize(true)

    }

}

