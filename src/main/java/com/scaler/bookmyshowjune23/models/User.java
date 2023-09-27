package com.scaler.bookmyshowjune23.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private  String name;
    private  String email;
    private  String passwd;
    private  int age;
    private  String phoneNo;
}
