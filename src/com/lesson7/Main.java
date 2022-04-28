package com.lesson7;

public class Main {

    public static void main(String[] args) {

        String[] mass = {"Я", "Java", "Изучаю"};
        String bufferMass = mass[2];
        mass[2] = mass[1];
        mass[1] = bufferMass;
        System.out.println(concatStr(mass));
        System.out.println(getStr(mass));
        System.out.println(joinStr(mass));
    }

    private static String getStr(String[] mass) {
        String plus = mass[0] + " " + mass[1] + " " + mass[2];
        return plus;
    }

    private static String concatStr(String[] mass) {
        String concatStr = mass[0].concat(" ") + mass[1].concat(" ") + mass[2];
        return concatStr;

    }

    private static String joinStr(String[] mass) {
        String joinStr = String.join(" ", mass);
        return joinStr;
    }

}


