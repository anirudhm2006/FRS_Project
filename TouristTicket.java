package com.upgrad.frs;

public class TouristTicket {
     public String hotelAddress;
     public String [] selectedTouristLocation = new String[5];

     public String getHotelAddress(){
          return hotelAddress;
      }
      public String [] getTouristLocations(){
            return selectedTouristLocation;
      }

     public void removeTouristLocations(String location){

      }

     public void addTouristLocations(String location){

      }
}
