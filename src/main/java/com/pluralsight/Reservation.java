package com.pluralsight;

public class Reservation {
    private String roomType;
    private double roomPrice;
    private int numberOfDays;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfDays, boolean isWeekend) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.numberOfDays = numberOfDays;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            return isWeekend ? 139 : 139 * 1.10;
        }
        return isWeekend ? 124 : 124 * 1.10;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        return roomPrice * numberOfDays;
    }

}
