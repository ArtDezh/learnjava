package com.artdezh.spring.mvc.learnjava;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Иван", 40),
                new Teacher("Анна", 22, "математики")
        };

        for (Person person : people) {
            person.introduce();
        }
    }
}
