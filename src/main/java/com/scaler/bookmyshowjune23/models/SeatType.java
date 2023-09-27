package com.scaler.bookmyshowjune23.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatType extends  BaseModel{
   private String name;

}
