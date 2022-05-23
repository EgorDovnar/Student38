package com.company.model;

import com.company.base.People;

public class Student extends People {

    public Student(String name, String sname, int age, Address address) {
        super(name, sname, age, address);
    }


    public String toString() {
        return " " + getName() + " " + getSname();
    }

    public void displayInfo() {
        System.out.println ("Студент:" + "\n ФИО: " + getName() + " " + getSname() + "\n Возраст: " + getAge() + "\n Адрес: " + getAddress().toString());
    }
}
