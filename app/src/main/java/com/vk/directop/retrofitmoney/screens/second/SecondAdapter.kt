package com.vk.directop.retrofitmoney.screens.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vk.directop.retrofitmoney.R
import com.vk.directop.retrofitmoney.model.beznal.BeznalItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listBeznal = emptyList<BeznalItem>()

    class SecondViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SecondAdapter.SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, true)
        return SecondAdapter.SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondAdapter.SecondViewHolder, position: Int) {
        holder.itemView.item_name.text = listBeznal[position].base_ccy
        holder.itemView.item_buy.text = listBeznal[position].buy
        holder.itemView.item_sell.text = listBeznal[position].sale

    }

    override fun getItemCount(): Int {
        return listBeznal.size
    }

    fun setList(list: List<BeznalItem>){
        listBeznal = list
        notifyDataSetChanged()
    }

}