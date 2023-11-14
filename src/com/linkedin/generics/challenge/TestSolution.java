package com.linkedin.generics.challenge;


import java.util.List;

public class TestSolution {
    public static void main(String[] args) {
        List<Long> longList = List.of(100L, 400L, 200L, 800L, 500L);
        NumberOperations<Long> numberOperations = new NumberOperations<>(longList);
        System.out.println("Original list: " + longList);
        System.out.println("Sorted list: " + numberOperations.getSortedNumbers());
        System.out.println("Max value: " + numberOperations.getMaximumValue());
    }
}
