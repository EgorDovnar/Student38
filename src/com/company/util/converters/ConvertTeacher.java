package com.company.util.converters;

import com.company.model.Metodist;
import com.company.model.Teacher;

public class ConvertTeacher implements PersonConverter<Teacher, Metodist> {

    @Override
    public Metodist convert(Teacher teacher) {
        PersonConverter<Teacher, Metodist> convert;
        convert = (b) -> new Metodist(b.getName(), b.getSname(), b.getAge(), b.getAddress());
        return convert.convert(teacher);
    }
}
