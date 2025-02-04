package com.example.demo.entity;

public class Student {

    private String firstName;
    private String secondName;

    public Student() {
    }
    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getSecondName() {
        return secondName;
    }
}
