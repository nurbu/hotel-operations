package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedBasicRooms;
    private int bookedSuites;

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedBasicRooms, int bookedSuites) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = bookedBasicRooms;
        this.bookedSuites = bookedSuites;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        bookedBasicRooms = 0;
        bookedSuites = 0;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite && numberOfRooms <= this.numberOfRooms) {
            bookedBasicRooms += numberOfRooms;
            return true;
        } else if (!isSuite && numberOfRooms <= this.numberOfRooms) {
            bookedSuites += numberOfRooms;
            return true;
        }
        return false;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }
}
