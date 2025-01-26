package com.parking.app.CustomerService.Http.response;

import com.parking.app.CustomerService.dto.BookingDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingByCustomerResponse {

    private String name;
    private List<BookingDto> BookingDtoList;
}
