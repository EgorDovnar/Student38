package com.company.util.converters;

import com.company.model.Metodist;
import com.company.model.Teacher;

public class ConvertMetodist implements PersonConverter<Metodist, Teacher> {

    @Override
    public Teacher convert(Metodist metodist) {
        PersonConverter<Metodist, Teacher> convert;
        convert = (a) -> new Teacher(a.getName(), a.getSname(), a.getAge(), a.getAddress());
        return convert.convert(metodist);
    }
}
