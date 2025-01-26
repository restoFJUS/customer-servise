package com.parking.app.CustomerService.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

   /* @ManyToOne(fetch = FetchType.LAZY)//solo se carga en el momento que se requiera
    @JoinColumn(name = "booking_id")//Dato con el que se mapea en la tabla categoria
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @Transient
    private Booking booking;*/
}
