package com.example.movieapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.GridLayoutManager
import com.example.movieapp.Adapters.RecyclerAdapter
import com.example.movieapp.ItemClass.NewReleaseItem
import kotlinx.android.synthetic.main.fragment_drama.*
import kotlinx.android.synthetic.main.fragment_movie_details.*


class MovieDetailsFragment : Fragment(R.layout.fragment_movies) {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_details, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        toolbar.setNavigationOnClickListener {
            it.findNavController().navigateUp()
        }

        val longestRide:Int =  R.drawable.aquama
        val blacklist:Int = R.drawable.aquama
        val haunting:Int  = R.drawable.aquama
        val adama:Int  = R.drawable.aquama
        val movies: List<NewReleaseItem> =  listOf(

                NewReleaseItem(longestRide,"jason Momoa"),
                NewReleaseItem(blacklist,"jason Momoa"),
                NewReleaseItem(haunting,"jason Momoa"),
                NewReleaseItem(adama,"jason Momoa"),
        )




      recyclerView2_details.adapter = RecyclerAdapter(movies)

       recyclerView2_details.layoutManager = GridLayoutManager(requireContext(), 1, GridLayoutManager.HORIZONTAL,false)

        recyclerView2_details.setHasFixedSize(true)


       



    }




}