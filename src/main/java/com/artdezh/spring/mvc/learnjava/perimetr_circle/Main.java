package com.artdezh.spring.mvc.learnjava.perimetr_circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r = readInput();
        float result = Math.round((2 * Math.PI * r) * 100) / 100.0f;

        System.out.println(result);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine().trim());
    }
}
