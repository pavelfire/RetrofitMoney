package com.vk.directop.retrofitmoney

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.vk.directop.retrofitmoney.screens.first.FirstFragment
import com.vk.directop.retrofitmoney.screens.second.SecondFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return  2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            else -> SecondFragment()

        }
    }

}
//https://www.youtube.com/watch?v=yHSSTgE62-M