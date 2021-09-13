package com.shakircam.busticket.repository

import com.shakircam.busticket.utils.Constants

class BusRepository {
    suspend fun getSingleItem() = Constants.getSingleSeat()
    suspend fun getDoubleItem() = Constants.getDoubleSeat()
}