package com.pluralsight;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RoomTest {

    // checkIn
    @Test
    public void checkIn_IsNotOccupiedandIsNotDirty_True() {
        // Arrange

        Room room = new Room();

        //Act

        room.checkIn();

        //Assert

        assertEquals(true, room.isDirty());
        assertEquals(true, room.isOccupied());

    }

    @Test
    public void checkOut_IsOccupiedandIsDirty_False() {
        // Arrange
        Room room = new Room();

        // Act
        room.checkOut();

        //Assert
        assertEquals(false, room.isDirty());
        assertEquals(false, room.isOccupied());
    }

    @Test
    public void cleanRoom_
    // Arrange

    // Act

    //Assert


    // checkout()
}
