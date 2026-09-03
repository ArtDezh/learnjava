package com.artdezh.spring.mvc.learnjava.area_rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> inputs = readInput();
        int a = inputs.getFirst();
        int b = inputs.getSecond();

        int result = a * b;

        System.out.println(result);
    }

    public static Pair<Integer, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] parts = input.split(" \\| ");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        return new Pair<>(a, b);
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
