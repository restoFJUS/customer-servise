package com.parking.app.CustomerService.client;

import com.parking.app.CustomerService.dto.BookingDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "BookingService", url = "localhost:9092/booking")
public interface BookingClient {

    @GetMapping( "/search-by-customer/{idCustomer}")
    List<BookingDto> findBookingByCustomerId(@PathVariable Long idCustomer);
}
