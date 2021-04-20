package com.upgrad.frs;

public class Main {
    public static void main(String[] args) {
        Ticket ticket= new Ticket();
        ticket.pnr= "AR1454";
        System.out.println(ticket.pnr);
        ticket.from="Bangalore";
        ticket.to="Pune";
        System.out.println(ticket.from);
        System.out.println(ticket.to);

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
