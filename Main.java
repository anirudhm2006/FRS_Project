package com.upgrad.frs;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.flightNumber = "2445";
        flight.airline= "AIR INDIA";
        System.out.println(flight.flightNumber);
        System.out.println(flight.airline);

        Address ad = new Address();
        ad.street="dd";
        ad.city="BN";
        ad.state="KA";
        System.out.println(ad.getAddressDetails());
    }
}
