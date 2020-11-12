package com.example.movieapp.Adapters

import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.movieapp.screens.DramaFragment
import com.example.movieapp.screens.MoviesFragment
import com.example.movieapp.screens.ShowFragment

class PageAdapter (fm:FragmentManager,lifecycle: Lifecycle,private val fragList:List<Fragment>):FragmentStateAdapter(fm,lifecycle) {




    override fun getItemCount(): Int {
        return fragList.size
    }


    override fun createFragment(position: Int): Fragment {
        return fragList[position]
    }



}




