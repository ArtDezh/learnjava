package com.artdezh.spring.mvc.learnjava;

public class Main {
    static void main() {
        Student student1 = new Student("Pitter", 25);
        Student student2 = new Student("Bob", 11);

        student1.setAge(40);

        student1.introduce();
        student2.introduce();
    }
}
