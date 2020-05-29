package com.ngocvm.example.Day84.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class BookApplication {
    private static List<Book> listBooks = new ArrayList<>();
    static {
        listBooks.add(new Book("Thinking in Java", 39, 5, "Bruce Eckel"));
        listBooks.add(new Book("Thinking in Java", 39, 4, "Bruce Ly"));
        listBooks.add(new Book("Effective Java", 33.63f, 4, "Joshua Bloch"));
        listBooks.add(new Book("Java SE 8 for the Really Impatient", 37f, 4, "Cay Horstmann"));
        listBooks.add(new Book("Java 8: The Fundamentals", 28f, 4, "Dane Cameron"));
        listBooks.add(new Book("Java 8: Lambdas", 32f, 4, "Richard Warburton"));
        listBooks.add(new Book("Java Puzzlers", 40.2f, 5, "Joshua Bloch"));
        listBooks.add(new Book("Core Java for the Impatient", 35.96f, 3, "Cay Horstmann"));
        listBooks.add(new Book("Object-Oriented Design and Patterns", 122.35f, 4, "Cay Horstmann"));
        listBooks.add(new Book("Thinking in C++", 59.13f, 4, "Bruce Eckel"));
    }

    public static void main(String[] args) {
        System.out.println("How do you want to sort the list of books?");
        System.out.println("    1.By title in ascending order");
        System.out.println("    2.By price in descending order");
        System.out.println("    3.By rating in descending order");
        System.out.println("    4.First by title, then by price, and by rating (all in ascending order)");
        System.out.println("Enter your option: ");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        System.out.println(option);
        switch (option) {
            case 1:
                sortByTitleAsc();
                break;
            case 2:
                sortByPriceDes();
                break;
            case 3:
                sortByRatingDes();
                break;
            case 4:
                sortByAllAsc();
                break;
            default:
                break;
        }

        System.out.println();
        //--- How much is the total cost of all of these books?
        float sumOfPrice = (float) listBooks.stream().mapToDouble(b -> b.getPrice()).sum();
        System.out.println("The total cost of all of these books: " + sumOfPrice);

        //--- How much is the average price for each book?
        double averagePrice = listBooks.stream().mapToDouble(b->b.getPrice()).average().getAsDouble();
        System.out.println("The average price for each book: " + averagePrice);

        //--- Which is the most expensive book?
        Optional<Book> expensiveBook = listBooks.stream().max((b1, b2) -> Float.compare(b1.getPrice(), b2.getPrice()));
        if (expensiveBook.isPresent()) {
            Book book = expensiveBook.get();
            System.out.println("The most expensive book: " + book);
        }

        //--- Which is the cheapest book?
        Optional<Book> cheapest = listBooks.stream().min((b1, b2) -> Float.compare(b1.getPrice(), b2.getPrice()));
        if (cheapest.isPresent()) {
            Book book2 = cheapest.get();
            System.out.println("The cheapest book: " + book2);
        }

        //--- How much is the average rating of these books?
        double avg = listBooks.stream().mapToInt(b->b.getRating()).average().getAsDouble();
        System.out.println("The average rating of these books: " + avg);
    }

    public static void sortByTitleAsc() {
        listBooks.stream().sorted((b1, b2) -> b2.getTitle().compareTo(b1.getTitle()))
                          .forEach(System.out::println);
    }

    public static void sortByPriceDes() {
        listBooks.stream().sorted((b1, b2) -> (int)(b1.getPrice() - b2.getPrice()))
                          .forEach(System.out::println);
    }

    public static void sortByRatingDes() {
        listBooks.stream().sorted((b1, b2) -> b1.getRating() - b2.getRating())
                          .forEach(System.out::println);
    }

    public static void sortByAllAsc() {
        listBooks.stream().sorted()
                          .forEach(System.out::println);
    }
}
