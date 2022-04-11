package com.lesson3.homework3.Class;

public class Address {

    private String city;
    private String street;
    private String home;
    private String room;

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Address(String city, String street, String home, String room) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.room = room;
    }

    public String displayInfo() {
        return "Город: " + city + "\nУлица: " + street + "\nДом: " + home + "\nКвартира: " + room;
    }

}