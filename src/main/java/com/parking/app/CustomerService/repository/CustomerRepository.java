package com.parking.app.CustomerService.repository;

import com.parking.app.CustomerService.entity.Booking;
import com.parking.app.CustomerService.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //public Customer  findByBooking(Booking booking);
}
