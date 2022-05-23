package com.company.util;

import com.company.base.People;
import com.company.exception.OldYoungException;

import java.util.Comparator;

public class AgeUtilAndSort implements Comparator<People> {

    @Override
    public int compare(People a1, People a2) {
        if (a1.getAge() > a2.getAge()) {
            return 1;
        } else if (a1.getAge() < a2.getAge()) {
            return -1;
        } else return 0;
    }

    public static final int youngAge = 10;
    public static final int oldAge = 100;
    public static void checkAge(int age) throws OldYoungException {
        if ((age < youngAge) || (age > oldAge)) {
            throw new OldYoungException("Возраст не подходит!" +
                    "Выберете кожаный мешок нужного возраста!");
        }
    }
}
