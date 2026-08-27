package com.artdezh.spring.mvc.learnjava;

public class Student extends Person {
    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void introduce() {
        System.out.println("Меня зовут " + getName() + ", я студент университета " + university);
    }
}
