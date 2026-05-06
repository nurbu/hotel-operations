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
    // Arrange

    // Act

    //Assert


    // checkout()
}
