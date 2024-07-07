package com.travel_app.rest_service.Model;

import com.travel_app.rest_service.Request.FlightReservationRequest;
import com.travel_app.rest_service.Request.HotelReservationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequest {
    private HotelReservationRequest hotelReservationRequest;
    private FlightReservationRequest flightReservationRequest;
}
