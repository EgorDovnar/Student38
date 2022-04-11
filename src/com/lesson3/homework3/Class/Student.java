package com.lesson3.homework3.Class;

public class Student {

    private String name;
    private String sname;
    int age;
    private Address address;

    public Student(String name, String sname, int age, Address address) {
        this.name = name;
        this.sname = sname;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String displayInfo() {
        return "Имя: " + name + "\nФамилия: " + sname + "\nВозраст: " + age + "\nАдрес: " + address.displayInfo();
    }

    public Address getAddress() {
        return address;
    }
}
