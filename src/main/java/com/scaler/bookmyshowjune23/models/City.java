package com.scaler.bookmyshowjune23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel{
    @OneToMany(mappedBy="city")//you put the name of the attribute in the other class that is representing the relation
private List<Theatre> theatres;
private  String name;
}
