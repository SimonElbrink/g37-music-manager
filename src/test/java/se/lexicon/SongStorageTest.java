package se.lexicon;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.data.SongStorage;

import static org.junit.Assert.*; // WildCard - imports every static method from Assert.


public class SongStorageTest {

    @Before
    public void init(){
        String[] testSongs = {"Here Come the Sun", "Happy Day", "Java is On My Mind"};
        SongStorage.setSongTitles(testSongs);

    }

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
    public void test_add_unsuccessfully_duplicates(){
        //Not Allowed to add duplicates. hopefully...

        //Arrange
        String songToAdd = "Happy Day";
        boolean wasAdded = true;

        //Act
        wasAdded = SongStorage.add(songToAdd);

        assertFalse(wasAdded);




    }

}