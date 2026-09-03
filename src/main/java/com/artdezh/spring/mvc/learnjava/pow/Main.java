package com.artdezh.spring.mvc.learnjava.pow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> inputs = readInput();
        int n = inputs.getFirst();
        int e = inputs.getSecond();
        long result = n;
        if (e == 0) {
            result = 1;
        } else {
            for (int i = 1; i < e; i++) {
                result = result * n;
            }
        }

        System.out.println(result);
    }

    public static Pair<Integer, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] parts = input.split(" \\| ");

        int n = Integer.parseInt(parts[0]);
        int e = Integer.parseInt(parts[1]);

        return new Pair<>(n, e);
    }
}

class Pair<A, B> {
    private final A first;
    private final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
