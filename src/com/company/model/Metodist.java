package com.company.model;

import com.company.base.People;

import java.util.ArrayList;

public class Metodist extends People {
    private ArrayList<Teacher> teachers;

    public Metodist(String name, String sname, int age, Address address) {
        super(name, sname, age, address);
        this.teachers = new ArrayList<>();
    }
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
}
