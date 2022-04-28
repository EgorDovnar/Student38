package com.lesson9;

import com.exeption.YongException;
import com.util.AgeUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        AgeUtil.checkAge(-20);

        try {
            ArrayList<Integer> mass = new ArrayList<>();
            mass.add(10);
            mass.add(11);

            mass.get(3);
            System.out.println("Good");

        } catch (Exception e) {
            e.getMessage();
            System.out.println("Bad");

        }
    }
}



