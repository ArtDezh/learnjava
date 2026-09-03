package com.artdezh.spring.mvc.learnjava.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        List<Long> result = printFibonacci(n);
        System.out.println(result);

    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine().trim());
    }

    public static List<Long> printFibonacci(int count) {
        int first = 0;
        int second = 1;
        List<Long> listResult = new ArrayList<>();
        listResult.addFirst(0L);
        for (int i = 1; i < count; i++) {
            //System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
            listResult.add((long) first);
        }
        return listResult;
    }
}
