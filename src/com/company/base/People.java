package com.company.base;

import com.company.exception.OldYoungException;
import com.company.model.Address;
import com.company.util.AgeUtilAndSort;

public abstract class People implements Comparable<People>{
    private String name;
    private String sname;
    private int age;
    private Address address;

    public People(String name, String sname, int age, Address address) {
        this.name = name;
        this.sname = sname;
        try {
            setAge(age);
        } catch (OldYoungException e) {
            System.out.print(e.getMessage());
        }
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws OldYoungException {
        try {
            AgeUtilAndSort.checkAge(age);
            this.age = age;}

        catch (OldYoungException e){
            System.out.println(e.getMessage());}
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int compareTo(People obj) {
        int per;
        per = this.name.compareTo(obj.getName());
        if (per != 0) {
            return per;
        } else {
            per = this.sname.compareTo(obj.getSname());
            if (per != 0) {
                return per;
            } else {
                if (this.age > obj.getAge()) {
                    return 1;
                } else if (this.age < obj.getAge()) {
                    return -1;
                } else return 0;}
        }
    }

    @Override
    public String toString() {
        final String info = " Имя " + name + " Фамилия " + sname + " Возраст " + age + " " + address.toString();
        return info;
    }
}
