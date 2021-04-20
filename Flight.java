package com.upgrad.frs;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
    public int bookedSeats;

    public String getFlightDetails(){
        return flightNumber+ ','+ airline;
     }

    public boolean checkAvailability(){
        if(capacity==bookedSeats)
            return false;
        else
            return true;
    }

}
