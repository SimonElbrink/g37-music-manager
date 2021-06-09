package se.lexicon;

import org.junit.Test;

import static org.junit.Assert.*;


public class SongStorageTest {

    @Test
    public void test_add_successfully() {

        //Arrange
        String songToAdd = "Mr. Blue Sky";
        boolean wasAdded = false;

        //Act
        wasAdded = SongStorage.add(songToAdd);

        //Assert
        assertTrue(wasAdded);
    }

    @Test
    public void test_add_unsuccessfully(){
        //Not Allowed to add duplicates. hopefully...

        //Arrange
        String songToAdd = "Happy Day";
        boolean wasAdded = true;

        //Act
        wasAdded = SongStorage.add(songToAdd);

        assertFalse(wasAdded);




    }

}