package com.vk.directop.retrofitmoney.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import com.google.android.material.tabs.TabLayoutMediator
import com.vk.directop.retrofitmoney.R
import com.vk.directop.retrofitmoney.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_root.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class RootFragment : Fragment() {

    private var ctx: Context ?= null

    override fun onAttach(context: Context){
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        view.tab_layout.tabIconTint = null //управление цветом иконок самостоятельно
        view.view_pager.adapter = ViewPagerAdapter(ctx as FragmentActivity)

        TabLayoutMediator(view.tab_layout, view.view_pager){
            tab, pos ->
            when(pos){
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_monetization_on_24)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_attach_money_24)
                }
            }
        }.attach()
        return view
    }


}