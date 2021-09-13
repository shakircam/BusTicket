package com.shakircam.busticket.adapter

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.shakircam.busticket.model.Ticket
import com.shakircam.busticket.databinding.DoubleItemBinding
import com.shakircam.busticket.databinding.SingleItemBinding

sealed class BusViewHolder(binding: ViewBinding): RecyclerView.ViewHolder(binding.root){

class SingleViewHolder(private val binding: SingleItemBinding) : BusViewHolder(binding){
      fun bind(single: Ticket.SingleTicket){
          binding.firstTx.text = single.first_seat
          binding.secondTx.text = single.second_seat
          binding.thirdTx.text = single.third_seat
          binding.fourTx.text = single.four_seat
      }
}
class DoubleViewHolder(private val binding: DoubleItemBinding) : BusViewHolder(binding){
    fun bind(double: Ticket.DoubleTicket){
        binding.firstTx.text = double.first_seat
        binding.secondTx.text = double.second_seat
        binding.thirdTx.text = double.third_seat
        binding.fourTx.text = double.four_seat
        binding.fiveTx.text = double.five_seat
    }
  }
}
