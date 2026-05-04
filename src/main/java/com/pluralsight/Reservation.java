package com.pluralsight;

public class Reservation {
    private String roomType;
    private double roomPrice;
    private int numberOfDays;
    private boolean isWeekend;

    public Reservation(String roomType, double roomPrice, int numberOfDays, boolean isWeekend) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.numberOfDays = numberOfDays;
        this.isWeekend = isWeekend;
    }

    
}
