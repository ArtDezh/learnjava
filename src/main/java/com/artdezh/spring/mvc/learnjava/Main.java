package com.artdezh.spring.mvc.learnjava;

public class Main {
    public static void main(String[] args) {

        Person person = new Doctor("Сергей", 35, "врач-кардиолог");
        person.introduce();
    }
}
