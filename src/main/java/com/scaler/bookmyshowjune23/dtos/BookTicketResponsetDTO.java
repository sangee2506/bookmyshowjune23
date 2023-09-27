package com.scaler.bookmyshowjune23.dtos;

import com.scaler.bookmyshowjune23.models.Auditorium;

import java.util.List;

public class BookTicketResponsetDTO {

    private int amount;
    private Long ticketId;

    private List<String> seatNumber;
    private Auditorium auditorium;


}
//paymentlink:- bookmyshow.com/pay/{ticketId}
