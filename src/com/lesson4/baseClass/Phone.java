package com.lesson4.baseClass;

public abstract class Phone {
    private String companyName;
    private String model;

    public Phone(String companyName, String model) {
        this.companyName = companyName;
        this.model = model;
    }
    public abstract void call();

    public abstract void ring();

    @Override
    public String toString() {
        return "Phone: " + "companyName='" + companyName + "', model='" + model  +"'" ;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getModel() {
        return model;
    }

}
