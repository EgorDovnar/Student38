package com.company.model;

import java.util.ArrayList;

public class Group {
    private String title;
    private int clas;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Group(String title, int course) {
        this.title = title;
        this.clas = course;
        this.students = new ArrayList<>();
        this.teacher = null;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

}