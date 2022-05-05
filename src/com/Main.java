package com;

import com.model.Dog;
import com.model.Raccoon;
import com.util.Converter;

public class Main {
    public static void main(String[] args) {

        Converter<String, Integer> converter = element -> element.toString();

        int age = 45;
        String ageStr = converter.converter(age);

        Converter<Raccoon, Dog> evolution = dog -> new Raccoon(dog.getName(), dog.getAge(), "Red");

        Dog dog = new Dog("Rex", 3, 15);

        Raccoon raccoon = evolution.converter(dog);

        System.out.println(raccoon.getName() + " "
                            + raccoon.getAge() + " "
                            + raccoon.getColor());
    }
}
