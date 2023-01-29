package com.example.books;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Richest Man In Babylone", 180, "Jorge S. Clason", "educational", LocalDate.parse("1956-07-20"), 4.8);
//        System.out.println(book);
        Book book2 = new Book("Think And Grow Rich", 380, "Jorge S. Clason", "educational", LocalDate.parse("1956-07-20"), 4.7);
        Book book3 = new Book("The Little Book OF Commonsense Investing ", 180, "Jack Bagel", "educational", LocalDate.parse("1956-07-20"), 4.8);
        Book book4 = new Book("How To Win Friends And Influence People", 210, "Deal Carnage", "educational", LocalDate.parse("1956-07-20"), 4.7);
        Book book5 = new Book("Hook Build Habit Forming Applications", 170, "Tim Cook", "educational", LocalDate.parse("1956-07-20"), 4.5);
        Book book6 = new Book("Influence The Psychology Of Persuasion", 230, "Jorge S. Clason", "educational", LocalDate.parse("1956-07-20"), 4.6);
        Book book7 = new Book("Rich Dad Poor Dad", 210, "Robert Kiyosaki", "educational", LocalDate.parse("1956-07-20"), 4.8);

        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        library.addBookToLibrary(book4);
        library.addBookToLibrary(book5);
        library.addBookToLibrary(book6);
        library.addBookToLibrary(book7);

        System.out.println("Books by rating: " + library.bookByRating(4.8));
        System.out.println("Books by author: " + library.bookByAuthor("Jorge S. Clason"));
        System.out.println("Books by pages: " + library.bookByPages(210));
        System.out.println("Books by type: " + library.bookByType("educational"));
    }
}
