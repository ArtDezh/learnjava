package com.artdezh.spring.mvc.learnjava.multDigits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        String result = "Произведение цифр числа " + n + " равно " + multDigits(stringToChar(intToString(n)));

        System.out.println(result);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine().trim());
    }

    public static String intToString(int n) {
        return String.valueOf(n);
    }

    public static char[] stringToChar(String str) {
        return str.toCharArray();
    }

    public static String multDigits(char[] chars) {
        int multResult = 1;
        for (char aChar : chars) {
            multResult *= Integer.parseInt(String.valueOf(aChar));
        }
        return String.valueOf(multResult);
    }
}