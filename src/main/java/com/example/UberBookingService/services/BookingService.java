package com.example.UberBookingService.services;

import com.example.UberBookingService.dto.CreateBookingDto;
import com.example.UberBookingService.dto.CreateBookingResponseDto;
//import com.example.UberBookingService.dto.UpdateBookingRequestDto;
//import com.example.UberBookingService.dto.UpdateBookingResponseDto;
//import com.example.UberBookingService.models.Booking;

public interface BookingService {

    CreateBookingResponseDto createBooking(CreateBookingDto bookingDetails);

//    UpdateBookingResponseDto updateBooking(UpdateBookingRequestDto bookingRequestDto, Long bookingId);
}
