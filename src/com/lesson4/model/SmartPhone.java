package com.lesson4.model;

import com.lesson4.baseClass.Phone;

public class SmartPhone extends Phone {

    private  String operationSystem;

    public SmartPhone(String companyName, String model, String operationSystem) {
        super(companyName, model);
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString(){
        return super.toString() + " operationSystem: " + operationSystem;
    }

    @Override
    public void call() {
        System.out.println("SmartPhone call");
    }

    @Override
    public void ring() {
        System.out.println("SmartPhone ring");
    }
}

