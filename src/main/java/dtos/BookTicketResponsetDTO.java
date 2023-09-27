package dtos;

import models.Auditorium;

import java.util.List;

public class BookTicketResponsetDTO {

    private int amount;
    private Long ticketId;

    private List<String> seatNumber;
    private Auditorium auditorium;


}
//paymentlink:- bookmyshow.com/pay/{ticketId}
