package com.artdezh.spring.mvc.learnjava.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        List<Long> result = new ArrayList<>();

    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine().trim());
    }

}
