package com.parking.app.CustomerService.controller;


import com.parking.app.CustomerService.entity.Customer;
import com.parking.app.CustomerService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> getListCustomer(){
        List<Customer> customers = new ArrayList<>();
        return ResponseEntity.ok(customerService.listAllCustomer());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long id) {
        Customer customer =  customerService.getCustomer(id);
        if (null==customer){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(customer);
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer( @RequestBody Customer customer){
        Customer customerCreated =  customerService.createCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerCreated);
    }

    @GetMapping(value = "/serch-bookings/{idCustomer}")
    public ResponseEntity<?> findBookingsByIdCustomer(@PathVariable Long idCustomer){
        return ResponseEntity.ok(customerService.findBookingsByIdCustomer(idCustomer));
    }

}
