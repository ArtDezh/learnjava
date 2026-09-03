package com.artdezh.spring.mvc.learnjava.sum_digits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        String result = "Сумма цифр числа " + n + " равна " + sumDigits(stringToChar(intToString(n)));

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

    public static String sumDigits(char[] chars) {
        int sumResult = 0;
        for (char aChar : chars) {
            sumResult += Integer.parseInt(String.valueOf(aChar));
        }
        return String.valueOf(sumResult);
    }
}
