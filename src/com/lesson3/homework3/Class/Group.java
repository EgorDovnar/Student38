package com.lesson3.homework3.Class;

public class Group {

    private String name;
    private String clas;
    private Teacher teacher;
    private Student student;

    public Group(String name, String clas, Teacher teacher, Student student) {
        this.name = name;
        this.clas = clas;
        this.teacher = teacher;
        this.student = student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String displayInfo() {
        return "Название: " + name + "\nКурс: " + clas
                + "\nИмя студента: " + student.displayInfo() + "\nИмя преподователя: " + teacher.displayInfo();
    }
}
