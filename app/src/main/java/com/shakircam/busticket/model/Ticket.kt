package com.shakircam.busticket.model

sealed class Ticket{

    class SingleTicket(
        val first_seat : String,
        val second_seat : String,
        val third_seat : String,
        val four_seat : String

    ): Ticket()

    class DoubleTicket(
        val first_seat : String,
        val second_seat : String,
        val third_seat : String,
        val four_seat : String,
        val five_seat : String

    ): Ticket()
}

