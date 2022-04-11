package com.lesson3;

public class Phone {
    String model;
    double sN;
    int age;

    public Phone(String model, double sN, int age) {
        this.model = model;
        this.sN = sN;
        this.age = age;
    }

    void modelInfo() {
        System.out.printf("Phone model: " + model + ". Serial number " + sN + ". Year of issue " + age);
    }

    void modelAge() {
        if (age > 2) {
            System.out.println("Shut up and take my money");
        }else{
            System.out.println("NO!");
        }
    }

    void serialNumber(int newSN) {
        sN = newSN;
    }
}



