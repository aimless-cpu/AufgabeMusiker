package com.company;

public class Person {
    //instance
    private String firstName;
    private String surName;
    private int age;

    //constructor

    public Person(String firstName, String surName, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
    }

    //method
    public static void makeMusic() {
        System.out.println("tralalala");
    }

    //getter setter

    public String getFirstName() {
        return firstName;
    }


    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
