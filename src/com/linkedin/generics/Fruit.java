package com.linkedin.generics;

public class Fruit implements Boxable {
    private String name;
    private String countryOfOrigin;

    private String color;
    private double weight;

    public Fruit(String name, String countryOfOrigin, String color, double weight) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
