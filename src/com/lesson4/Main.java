package com.lesson4;

import com.lesson4.baseClass.Phone;
import com.lesson4.model.SmartPhone;
import com.lesson4.model.SomePhone;
import com.lesson4.user.User;

public class Main {

    public static  void main(String[] args){
        User user = new User("Me");

        Phone somePhone1 = new SomePhone("Samsung", "s22", true, user);
        System.out.println(somePhone1);
        somePhone1.call();

        System.out.println("---------------");

        Phone smartPhone = new SmartPhone("Nokia", "3310", "Series 30+");
        System.out.println(smartPhone);
        smartPhone.ring();

        System.out.println("---------------");
        user.callPhone(somePhone1);
        System.out.println("---------------");
    }
}
