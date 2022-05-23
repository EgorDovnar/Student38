package com.company.model;

public class Address {
    private String city;
    private String street;
    private int home;
    private int room;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Address(String city, String street, int home, int room) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Адрес: " +
                "город = " + city +
                ", улица = " + street +
                ", дом = " + home +
                ", квартира = " + room + ".";
    }
}

