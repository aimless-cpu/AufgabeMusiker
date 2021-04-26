package com.company;
import com.company.*;

public class Artist extends Person {
    //instance
    private String artistName;

    //constructor
    public Artist(String artistName, String firstName, String surName, int age) {
        super(firstName, surName, age);
        this.artistName = artistName;
    }

    //method

    //getter setter

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
