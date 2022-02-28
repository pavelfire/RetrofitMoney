package com.vk.directop.retrofitmoney.screens.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.vk.directop.retrofitmoney.R
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: FirstAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        recyclerView = view.rv_first
        adapter = FirstAdapter()
        recyclerView.adapter = adapter
        viewModel.getNalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner,{list ->
            list.body()?.let { adapter.setList(it) }
        })
        return view
    }


}