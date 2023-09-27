package com.scaler.bookmyshowjune23.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Chair")
public class Seat extends  BaseModel{
    private String seatNo;

    @Column(name = "rowz")
    private  int row;

    @Column(name = "colz")
    private  int col;

    @ManyToOne
    private  SeatType seatType;
}
