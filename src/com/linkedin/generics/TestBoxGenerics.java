package com.linkedin.generics;

public class TestBoxGenerics {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Harry Potter and the Half Blood Prince", "JK Rowling (gross)", 0.5));
        bookBox.addItem(new Book("Deep Work", "Cal Newport", 0.25));
        System.out.println(bookBox.getLatestItem());
        System.out.println(bookBox.toString());
        System.out.println("Book count: " + BoxUtils.getCountOfItems(bookBox));
        System.out.println("Total weight of book box: " + bookBox.getTotalWeight());

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "India", "yellow", 0.5));
        fruitBox.addItem(new Fruit("Banana", "Brazil", "Green", 0.3));
        System.out.println(fruitBox.getLatestItem());
        System.out.println(fruitBox.toString());
        System.out.println("Fruit count: " + BoxUtils.getCountOfItems(fruitBox));
        System.out.println("Total weight of fruit box: " + fruitBox.getTotalWeight());
    }
}
