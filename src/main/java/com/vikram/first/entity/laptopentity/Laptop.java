package com.vikram.first.entity.laptopentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Laptop {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long laptopId;
    private String brand;
//    private Long allotedToRollNumber;


}

