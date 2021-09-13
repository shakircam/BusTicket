package com.shakircam.busticket.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shakircam.busticket.R
import com.shakircam.busticket.model.Ticket
import com.shakircam.busticket.databinding.DoubleItemBinding
import com.shakircam.busticket.databinding.SingleItemBinding

class BusAdapter : RecyclerView.Adapter<BusViewHolder>() {

    var items = listOf<Ticket>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BusViewHolder {
        return when(viewType){

            R.layout.single_item -> BusViewHolder.SingleViewHolder(
                SingleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            )
            R.layout.double_item -> BusViewHolder.DoubleViewHolder(
                DoubleItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> throw IllegalArgumentException("Invalid Layout Provider")
        }
    }

    override fun onBindViewHolder(holder: BusViewHolder, position: Int) {
        when(holder){
            is BusViewHolder.SingleViewHolder -> holder.bind(items[position] as Ticket.SingleTicket)
            is BusViewHolder.DoubleViewHolder -> holder.bind(items[position] as Ticket.DoubleTicket)
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is Ticket.SingleTicket -> R.layout.single_item
            is Ticket.DoubleTicket -> R.layout.double_item
            else -> R.layout.single_item
        }
    }


}