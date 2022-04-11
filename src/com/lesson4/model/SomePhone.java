package com.lesson4.model;

import com.lesson4.baseClass.Phone;
import com.lesson4.user.User;

public class SomePhone extends Phone {

    private boolean checkBth;
    private User user;

    public SomePhone(String companyName, String model, boolean checkBth, User user) {
        super(companyName, model);
        this.checkBth = checkBth;
        this.user = user;
    }

    public void  displayInfo(){
        System.out.println(" checkBth: " + checkBth);
        user.displayInfo();
    }

    @Override
    public String toString(){
        return super.toString() + " checkBth: " + checkBth;
    }

    @Override
    public void call() {
        System.out.println("SomePhone call");
    }

    @Override
    public void ring() {
        System.out.println("SomePhone ring");
    }
}
