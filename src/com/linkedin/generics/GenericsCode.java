package com.linkedin.generics;

import java.util.List;
import java.util.ArrayList;

public class GenericsCode {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Swedish");
        processLanguages(languages);
    }

    private static void processLanguages(List<String> data) {
        String language = data.get(0);
        System.out.println(language);
    }
}
