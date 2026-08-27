package com.artdezh.spring.mvc.learnjava;

public class Student extends Person {
    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public void study() {
        System.out.println(getName() + " учится в университете " + university);
    }
}
