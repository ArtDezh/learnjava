package com.artdezh.spring.mvc.learnjava;

public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void introduce() {
        System.out.println("Меня зовут " + getName() + ", я " + specialization);
    }

    public String getSpecialization() {
        return specialization;
    }
}
