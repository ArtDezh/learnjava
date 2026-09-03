package com.artdezh.spring.mvc.learnjava.factorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = readInput();
        int result = factorial(n);

        System.out.println(result);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine().trim());
    }

    public static int factorial(int number) {

        int result = 1;
        if (number == 0) return 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
