package com.shakircam.busticket.utils

import com.shakircam.busticket.model.Ticket

object Constants {

fun getDoubleSeat(): ArrayList<Ticket.DoubleTicket> {
    val seatList = ArrayList<Ticket.DoubleTicket>()
    val seat = Ticket.DoubleTicket(
        "55",
        "56",
        "57",
        "54",
        "53"
    )
    seatList.add(seat)
    return seatList
}
    fun getSingleSeat(): ArrayList<Ticket.SingleTicket> {
        val singleSeatList = ArrayList<Ticket.SingleTicket>()

        val seat1 = Ticket.SingleTicket(
            "D",
            "",
            "",
            "Dr"
        )
        singleSeatList.add(seat1)

        val seat2 = Ticket.SingleTicket(
            "4",
            "3",
            "2",
            "1"
        )
        singleSeatList.add(seat2)

        val seat3 = Ticket.SingleTicket(
            "8",
            "7",
            "6",
            "5"
        )
        singleSeatList.add(seat3)

        val seat4 = Ticket.SingleTicket(
            "12",
            "11",
            "10",
            "9"
        )
        singleSeatList.add(seat4)

        val seat5 = Ticket.SingleTicket(
            "16",
            "15",
            "14",
            "13"
        )
        singleSeatList.add(seat5)

        val seat6 = Ticket.SingleTicket(
            "20",
            "19",
            "18",
            "17"
        )
        singleSeatList.add(seat6)

        val seat7 = Ticket.SingleTicket(
            "24",
            "23",
            "22",
            "21"
        )
        singleSeatList.add(seat7)

        val seat8 = Ticket.SingleTicket(
            "28",
            "27",
            "26",
            "25"
        )
        singleSeatList.add(seat8)

        val seat9 = Ticket.SingleTicket(
            "32",
            "31",
            "30",
            "29"
        )
        singleSeatList.add(seat9)

        val seat10 = Ticket.SingleTicket(
            "36",
            "35",
            "34",
            "33"
        )
        singleSeatList.add(seat10)

        val seat11 = Ticket.SingleTicket(
            "40",
            "39",
            "38",
            "37"
        )
        singleSeatList.add(seat11)

        val seat12 = Ticket.SingleTicket(
            "44",
            "43",
            "42",
            "41"
        )
        singleSeatList.add(seat12)

        val seat13 = Ticket.SingleTicket(
            "48",
            "47",
            "46",
            "45"
        )
        singleSeatList.add(seat13)

        val seat14 = Ticket.SingleTicket(
            "52",
            "51",
            "50",
            "49"
        )
        singleSeatList.add(seat14)
        return singleSeatList
    }

}