package se.lexicon.model;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;


public class PersonTest {

    @Test
    public void person_SuccessfullyCreated(){
        //Arrange   //Act
        Person testObject = new Person("Test Testsson", Gender.OTHER, LocalDate.parse("1970-01-01"), "SWE");

        //Assert
        Assert.assertNotNull(testObject);
        assertNotEquals(0, testObject.getPERSON_ID());
        assertEquals("Test Testsson", testObject.getName());
        assertEquals(Gender.OTHER, testObject.getGender());
        assertEquals(LocalDate.parse("1970-01-01"),testObject.getBirthDate());
        assertEquals("SWE", testObject.getNationality());
    }

    @Test(expected = NullPointerException.class)
    public void person_UnSuccessfullyCreated_null(){
        Person testPerson = new Person(null, Gender.OTHER, LocalDate.parse("1970-01-01"), "SWE");
    }
    @Test(expected = IllegalArgumentException.class)
    public void person_UnSuccessfullyCreated_EmptyString(){
        Person testPerson = new Person("", Gender.OTHER, LocalDate.parse("1970-01-01"), "SWE");
    }

    @Test(expected = IllegalArgumentException.class)
    public void person_UnSuccessfullyCreated_SpacedString(){
        Person testPerson = new Person("     ", Gender.OTHER, LocalDate.parse("1970-01-01"), "SWE");
    }

    @Test(expected = IllegalArgumentException.class)
    public void person_UnSuccessfullyCreated_SpacedStringAndTooShort(){
        Person testPerson = new Person("  T  ", Gender.OTHER, LocalDate.parse("1970-01-01"), "SWE");
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void person_UnSuccessfullyCreated_ShortNameWithSpace(){
        Person testPerson = new Person("  T T  ", Gender.OTHER, LocalDate.parse("1970-01-01"), "SWE");
    }

    @Test
    public void SetBirthDate_successfully(){
        Person testObject = new Person("Test Testsson", Gender.OTHER, null, "SWE");

        testObject.setBirthDate(LocalDate.parse("1970-01-01"));

        assertEquals(LocalDate.parse("1970-01-01"),testObject.getBirthDate());

    }

    @Test(expected = NullPointerException.class)
    public void SetBirthDate_Unsuccessfully_Null(){
        Person testObject = new Person("Test Testsson", Gender.OTHER, LocalDate.parse("1970-01-01"), "SWE");

        testObject.setBirthDate(null);
    }





}