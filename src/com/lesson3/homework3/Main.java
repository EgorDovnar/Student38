package com.lesson3.homework3;

import com.lesson3.homework3.Class.Address;
import com.lesson3.homework3.Class.Group;
import com.lesson3.homework3.Class.Student;
import com.lesson3.homework3.Class.Teacher;

public class Main {

    public static void main(String[] args) {

        Address addressSt1 = new Address("ГородУченика1", "УлицаУченика1", "ДомУченика1", "КомнатаУченика1");
        Student student1 = new Student("ИмяСтудента1", "ФамилияСтудента1", 1, addressSt1);
        student1.displayInfo();

        Address addressSt2 = new Address("ГородУченика2", "УлицаУченика2", "ДомУченика2", "КомнатаУченика2");
        Student student2 = new Student("ИмяСтудента2", "ФамилияСтудента2", 2, addressSt2);
        student2.displayInfo();

        Address addressT1 = new Address("ГородУчителя1", "УлицаУчителя1", "ДомУчителя1", "КомнатаУчителя1");
        Teacher teacher1 = new Teacher("ИмяУчителя1","ФамилияУчителя1", 3, addressT1,1);
        teacher1.displayInfo();

        Address addressT2 = new Address("ГородУчителя2", "УлицаУчителя2", "ДомУчителя2", "КомнатаУчителя2");
        Teacher teacher2 = new Teacher("ИмяУчителя2","ФамилияУчителя2", 4, addressT2,2);
        teacher2.displayInfo();

        Group group = new Group("Группа1","Курс1", teacher1, student1);
        System.out.println(group.displayInfo());
    }
}
