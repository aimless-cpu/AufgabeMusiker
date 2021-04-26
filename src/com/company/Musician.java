package com.company;
import com.company.*;


public class Musician extends Artist {
    //instance
    private boolean isMusician;

    //constructor

    public Musician(String artistName, String firstName, String surName, int age, boolean isMusician) {
        super(artistName, firstName, surName, age);
        this.isMusician = isMusician;
    }

    //method
    public static void makeMusic() {
        System.out.println("make music");

    }


}
