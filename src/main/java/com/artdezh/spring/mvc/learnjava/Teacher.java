package com.artdezh.spring.mvc.learnjava;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void teach() {
        System.out.println(getName() + " преподает " + subject);
    }

    @Override
    public void introduce() {
        System.out.println("Меня зовут " + getName() + ", я преподаватель " + subject);
    }
}
