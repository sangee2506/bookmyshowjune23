package models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass//Dont create a separate table,instead add attributes to each of the child class
public class BaseModel {
    @Id
    private long id;
}
