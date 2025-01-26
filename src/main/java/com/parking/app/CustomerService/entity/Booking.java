package com.parking.app.CustomerService.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;



@Data
public class Booking {


    private Long id;
    private Long customerId;
    private Long garageId;
    private Date creationDate;
    private Date reservationDate;
}
