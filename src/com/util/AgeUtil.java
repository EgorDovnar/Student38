package com.util;

import com.exeption.OldException;
import com.exeption.YongException;

public class AgeUtil {

    public static void checkAge(int age) {
        try {
            checkAgeYoung(age);
            checkAgeOld(age);

            System.out.println("Возраст подходит");

        } catch (YongException | OldException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Конец");
        }

/*        try {
            if (age < 16) {
                throw new YongException("Возраст меньше 16");
            }

            if (age > 100) {
                throw new OldException("Возраст велик");
            }
            System.out.println("Возраст подходит");
       }*/
    }

    private static void checkAgeYoung(int age) throws YongException {
        if (age < 16) {
            throw new YongException("Возраст меньше 16");
        }
    }

    private static void checkAgeOld(int age) throws OldException {
        if (age > 100) {
            throw new OldException("Возраст больше 100");
        }
    }
}

