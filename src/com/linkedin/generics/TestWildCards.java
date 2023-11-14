package com.linkedin.generics;

//public class TestWildCards extends Box<?> {
public class TestWildCards {
    public static void main(String[] args) {
        // new Box<?>();

        // var box = BoxUtils.<?>emptyBox();

        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Harry Potter and the Half Blood Prince", "JK Rowling (gross)", 0.5));
        bookBox.addItem(new Book("Deep Work", "Cal Newport", 0.25));
        // unbounded wildcards
        System.out.println("Count of books: " + BoxUtils.getCountOfItems(bookBox));

        // upper bounded wildcards
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "India", "yellow", 0.5));
        fruitBox.addItem(new Fruit("Banana", "Brazil", "Green", 0.3));
        System.out.println("Average weight of fruit: " + Box.getAverageWeightOfFruit(fruitBox));
        Box<Apple> appleBox = new Box<>();
        Box.getAverageWeightOfFruit(appleBox);
        Box<Boxable> boxableBox = new Box<>();
        // Box.getAverageWeightOfFruit(boxableBox); // not valid argument
        // Box.getAverageWeightOfFruit(bookBox); // not valid argument

        // lower bounded wildcards
        Box.addAppleToBox(appleBox);
        Box.addAppleToBox(fruitBox);
        Box.addAppleToBox(boxableBox);
        // Box.addAppleToBox(bookBox); // not valid argument
    }
}
