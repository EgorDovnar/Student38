package com.company;

import com.company.util.converters.ConvertTeacher;
import com.company.model.*;
import com.company.util.FileReader;

import java.util.ArrayList;

public class Main {
    private static final String studentsPatch = "students.txt";
    private static final String teachersPatch = "teachers.txt";

    public static void main(String[] args) {
        Metodist major;
        Group groupOne = new Group("Group1", 1);
        Group groupTwo = new Group("Group2", 2);

        ArrayList<Teacher> listTeacher = new ArrayList<>();
        ArrayList<String> dataString = FileReader.ListParser(studentsPatch);
        System.out.println(dataString);
        for (String value : dataString) {
            String[] tempStr = FileReader.StringParser(value);
            groupOne.addStudent(FileReader.addStudent(tempStr));
            groupTwo.addStudent(FileReader.addStudent(tempStr));
        }
        dataString = FileReader.ListParser(teachersPatch);
        System.out.println(dataString);
        for (String value : dataString) {
            String[] tempStr = FileReader.StringParser(value);
            listTeacher.add(FileReader.addTeacher(tempStr));
        }
        if (listTeacher.size() >= 2) {
            groupOne.setTeacher(listTeacher.get(2));
            groupTwo.setTeacher(listTeacher.get(2));

            ConvertTeacher convT = new ConvertTeacher();
            major = convT.convert(listTeacher.get(1));
            System.out.println(major);
            major.setTeachers(listTeacher);
            System.out.println(major);
        }
    }
}
