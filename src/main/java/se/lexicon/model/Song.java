package se.lexicon.model;

import java.util.Objects;

public class Song {

    //Fields
    private String title;
    private String artist;
    private int durationInSeconds;
    private Album album; // Song has a relationship with Album.

    //Constructors
    public Song(String title, String artist, int durationInSeconds, Album album){
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        this.album = album;
    }

    //Can Create songs without Album
    public Song(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    //Getters & Setters Methods

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public Album getAlbum(){
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    //toSting Method
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", durationInSeconds=" + durationInSeconds +
                ", album=" + album +
                '}';
    }

    //Equals Method

    /**
     * Does not include Album in the Equals.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return durationInSeconds == song.durationInSeconds && Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    //HashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(title, artist, durationInSeconds);
    }

}
