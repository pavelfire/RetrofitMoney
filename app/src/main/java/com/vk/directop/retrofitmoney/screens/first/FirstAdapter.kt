package com.vk.directop.retrofitmoney.screens.first

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vk.directop.retrofitmoney.R
import com.vk.directop.retrofitmoney.model.nal.NalichkaItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class FirstAdapter : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    var listNalichka = emptyList<NalichkaItem>()

    class FirstViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FirstAdapter.FirstViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, true)
        return FirstViewHolder(view)
    }

    override fun onBindViewHolder(holder: FirstAdapter.FirstViewHolder, position: Int) {
        holder.itemView.item_name.text = listNalichka[position].base_ccy
        holder.itemView.item_buy.text = listNalichka[position].buy
        holder.itemView.item_sell.text = listNalichka[position].sale

    }

    override fun getItemCount(): Int {
        return listNalichka.size
    }

    fun setList(list: List<NalichkaItem>){
        listNalichka = list
        notifyDataSetChanged()
    }
}