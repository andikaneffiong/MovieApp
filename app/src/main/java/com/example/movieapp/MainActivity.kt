 package com.example.movieapp

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.example.movieapp.Adapters.AquaImageAdapter
import com.example.movieapp.Adapters.PageAdapter
import com.example.movieapp.Adapters.RecyclerAdapter

import com.example.movieapp.screens.DramaFragment
import com.example.movieapp.screens.MoviesFragment
import com.example.movieapp.screens.ShowFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_movie_details.*

 class MainActivity : AppCompatActivity() {


     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         setContentView(R.layout.activity_main)



     }



}
