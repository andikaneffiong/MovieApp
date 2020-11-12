package com.example.movieapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.movieapp.Adapters.AquaImageAdapter
import com.example.movieapp.Adapters.PageAdapter
import com.example.movieapp.Adapters.RecyclerAdapter
import com.example.movieapp.screens.DramaFragment
import com.example.movieapp.screens.MoviesFragment
import com.example.movieapp.screens.ShowFragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.aqua_item.*
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)






        val image = listOf<Int>(
            R.drawable.screem,
            R.drawable.screem,
            R.drawable.screem,
            R.drawable.screem
        )



        val fragments = listOf<Fragment>(MoviesFragment(), ShowFragment(), DramaFragment())

        aqua_viewpager.adapter = AquaImageAdapter(image)
        TabLayoutMediator(hero_tabs,aqua_viewpager){_, _ ->

        }.attach()



        viewPager.adapter = PageAdapter(requireFragmentManager(),lifecycle,fragments)

        TabLayoutMediator(tablayout,viewPager){tab, position ->
            when(position){

                0 -> tab.text = "Movies"
                1 -> tab.text = "Shows"
                2 -> tab.text = "Drama"
            }

        }.attach()

    }



}