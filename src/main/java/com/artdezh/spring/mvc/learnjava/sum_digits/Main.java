package com.artdezh.spring.mvc.learnjava.sum_digits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        String result = sumDigits(stringToChar(intToString(n)));

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
        for (int i = 0; i < chars.length; i++) {
            sumResult += Integer.parseInt(String.valueOf(chars[i]));
        }

        return String.valueOf(sumResult);
    }


}
