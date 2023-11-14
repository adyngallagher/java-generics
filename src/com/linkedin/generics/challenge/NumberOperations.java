package com.linkedin.generics.challenge;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.ArrayList;

public class NumberOperations <N extends Number & Comparable> {
    //instance variable
    private List<N> numbers;

    public NumberOperations(List<N> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    public List<N> getSortedNumbers() {
        return this.numbers.stream().sorted().collect(Collectors.toList());
    }

    public Number getMaximumValue() {
        return Collections.max(numbers);
    }
}
