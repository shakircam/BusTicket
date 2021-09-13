package com.shakircam.busticket.ui.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shakircam.busticket.model.Ticket
import com.shakircam.busticket.repository.BusRepository
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class BusViewModel(private val repository: BusRepository): ViewModel() {

    private val _ticketListItemsLiveData = MutableLiveData<List<Ticket>>()
    val ticketListItemsLiveData: LiveData<List<Ticket>>
        get() = _ticketListItemsLiveData

    init {
        getTicketListItems()
    }

    private fun getTicketListItems() = viewModelScope.launch {

        val ticketItemsList = mutableListOf<Ticket>()

        val singleTicket = async { repository.getSingleItem() }
        val doubleTicket = async { repository.getDoubleItem() }

        val single= singleTicket.await()
        val double = doubleTicket.await()
        ticketItemsList.addAll(single)
        ticketItemsList.addAll(double)
        _ticketListItemsLiveData.postValue(ticketItemsList)
    }


}