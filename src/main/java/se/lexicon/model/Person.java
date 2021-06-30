package se.lexicon.model;

import se.lexicon.data.PersonSequencer;

import java.time.LocalDate;

public class Person {

    private final int PERSON_ID;
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private String nationality; //SWE, NO, BRA, UK, FR, ESP, G, GB

    public Person(String name, Gender gender, LocalDate birthDate, String nationality) {
        this.PERSON_ID = PersonSequencer.getInstance().getNextInSequence();
        setName(name);
        setGender(gender);
        setBirthDate(birthDate);
        setNationality(nationality);
    }

    public int getPERSON_ID() {
        return PERSON_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            throw new NullPointerException("Name was Null");
        }

        name = name.trim();

        if (name.isEmpty() || name.length() < 2){
            throw new IllegalArgumentException("Name need to be at least 2 letters long");
        }

        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null){
            throw new NullPointerException("BirthDate Can not be Null");
        }

        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
