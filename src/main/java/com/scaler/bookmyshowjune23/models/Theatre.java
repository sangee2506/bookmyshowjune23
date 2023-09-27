package com.scaler.bookmyshowjune23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theatre extends  BaseModel{
    private  String name;
    private  String address;
    @OneToMany
    List<Auditorium> auditoriumList;
    @ManyToOne
    private City city;
}
