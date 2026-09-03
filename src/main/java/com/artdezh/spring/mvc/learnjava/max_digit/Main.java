package com.artdezh.spring.mvc.learnjava.max_digit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(List.of(1, 2, 3, 5, 2, 3, 4));
        data.sort(null);
        int result = data.getLast();

        System.out.println(result);
    }
}
