package com.scaler.bookmyshowjune23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter@Setter
@Entity
public class Ticket extends BaseModel{
    private  int amount;
    private Date timeOfBooking;

    @ManyToMany
    private List<Seat> seatList;
    @OneToMany
    private  List<Payment> payments;
    @ManyToOne
    private  Show show;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;
    @ManyToOne
    private  User bookedBy;
}
