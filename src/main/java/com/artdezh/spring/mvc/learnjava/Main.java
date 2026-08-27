package com.artdezh.spring.mvc.learnjava;

public class Main {
    static void main() {
        Student student1 = new Student("Peter", 25, "МГУ");
        Teacher teacher = new Teacher("Анна", 22, "математику");

        student1.introduce();
        student1.study();

        System.out.println("--------------------------------");

        teacher.teach();
    }
}
