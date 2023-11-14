package com.linkedin.generics;

import java.util.List;
import java.util.ArrayList;

public class Rules {
    public static void main(String[] args) {
        // List<int> integers = new ArrayList<>(); // can't use primitive types
        List<Integer> integers = new ArrayList<>();
        integers.add(10);  // auto boxing int into Integer
        int number = integers.get(0); // auto unboxing from Integer into int

        List<String> languages = new ArrayList<>();
        languages.add("English");

    }
}
