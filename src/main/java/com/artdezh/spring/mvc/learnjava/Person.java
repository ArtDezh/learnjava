package com.artdezh.spring.mvc.learnjava;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
