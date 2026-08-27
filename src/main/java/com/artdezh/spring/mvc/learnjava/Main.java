package com.artdezh.spring.mvc.learnjava;

public class Main {
    static void main() {
        Student student1 = new Student("Peter", 25, "МГУ");

        student1.introduce();
        student1.study();
    }
}
