package com.restful.booker.model;

import java.util.List;

public class BookingPojo {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
   
    private String additionalneeds;

    private List<String> bookingdates;
    
     public List<String> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(List<String> bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

  

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    // private String bookingdates;


}

