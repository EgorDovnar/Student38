package com.company.model;

import com.company.base.People;

public class Teacher extends People {
    private double money;
    private int students;

    public Teacher(String name, String sname, int age, Address address) {
        super(name, sname, age, address);
    }

    public Teacher(String name, String sname, int age, Address address, double money, int students) {
        super(name, sname, age, address);
        this.students = students;
        this.money = money;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double salary(int day) {
        return day * students;
    }

}
