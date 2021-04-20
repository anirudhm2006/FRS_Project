package com.upgrad.frs;

public class Address {
     public String street;
     public String city;
     public String state;

     public String getAddressDetails(){
         return street + ',' + city + ','+ state;
     }

     public void updateAddressDetails(String AddressDetail){

     }
}
