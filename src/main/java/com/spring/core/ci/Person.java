package com.spring.core.ci;

import java.util.List;

public class Person {
    private String name;
    private Integer personId;

    private Certificate certificate;
    private List<String> list;

    public Person(String name, Integer personId, Certificate certificate, List list) {
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                ", list=" + list +
                '}';
    }
}
