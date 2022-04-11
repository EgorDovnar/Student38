package com.lesson3.homework3.Class;

public class Teacher {

    private String name;
    private String sname;
    private int age;
    private Address address;
    private int pay;
    private int summ = money();

    public Teacher(String name, String sname, int age, Address address, int pay) {
        this.name = name;
        this.sname = sname;
        this.age = age;
        this.address = address;
        this.pay = pay;
    }

    public int money() {
        summ = pay * 30;
        return summ;
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

    public void setPay(int pay) {
        this.pay = pay;
    }


    public String displayInfo() {
         return "Имя: " + name + "\nФамилия: " + sname + "\nВозраст: " + age + "\nАдрес: " + address.displayInfo()
                + "\nЗарплата: " + money();
    }
}
