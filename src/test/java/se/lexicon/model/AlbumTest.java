package se.lexicon.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTest {

    private Album testObject;


    @Before // Before every Test do this..
    public void init(){
        testObject = new Album("TestName", "2021-01-01");

    }

    @Test
    public void test_successfully_created(){
        //Arrange
        Album testObject = null;
        String expectedName = "TestName";
        String expectedReleaseDate = "2021-01-01";

        //Act
        testObject = new Album("TestName", "2021-01-01");

        //Assert
        assertEquals(expectedName,testObject.getName());
        assertEquals(expectedReleaseDate,testObject.getReleaseDate());
    }



    @Test
    public void testEquals_false() {

        //Arrange
        Album notACopy = new Album("CopyTestName", "1970-01-01");

        boolean wasEqual = true;

        //Act
        wasEqual = testObject.equals(notACopy);

        //Assert
        assertFalse("Albums was the same.", wasEqual);

    }

    @Test
    public void testEquals() {

        //Arrange
        Album aCopy = new Album("TestName", "2021-01-01");

        boolean wasEqual = false;

        //Act
        wasEqual = testObject.equals(aCopy);

        //Assert
        assertTrue("Album was not equal", wasEqual);

    }

    @Test
    public void testHashCode() {

        //Arrange
        Album aCopy = new Album("TestName", "2021-01-01");

        int expectedHashCode = 255;
        int actualHashCode = 0;

        //Act
        expectedHashCode = testObject.hashCode();
        actualHashCode = aCopy.hashCode();

        //Assert
        assertEquals("HashCodes of objects was not equal", expectedHashCode, actualHashCode);
    }

    @Test
    public void testToString() {

        //Arrange
        String toString = null;

        //Act
        toString = testObject.toString();

        //Assert
        assertTrue(toString.contains("TestName"));
        assertTrue(toString.contains("2021-01-01"));
    }
}