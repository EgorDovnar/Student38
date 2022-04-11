package com.lesson4.user;

import com.lesson4.baseClass.Phone;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void  displayInfo(){
        System.out.println(" User name" + name);
    }

    public void callPhone(Phone phone){
        phone.call();
    }
}
