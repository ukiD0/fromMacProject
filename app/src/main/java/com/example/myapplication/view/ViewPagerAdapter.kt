package com.example.myapplication.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fm: java.util.ArrayList<Fragment>,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
    ): FragmentStateAdapter(fragmentManager,lifecycle){

    private var fraglist = fm

    override fun getItemCount(): Int {
        return  fraglist.size
    }

    override fun createFragment(position: Int): Fragment {
        return fraglist[position]
    }
}