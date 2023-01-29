package com.example.books;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String type;
    private LocalDate releaseDate;
    private double ratings;

    public Book(String title, int pages, String author, String type, LocalDate releaseDate, double ratings) {
        setTitle(title);
        setPages(pages);
        setAuthor(author);
        setType(type);
        setReleaseDate(releaseDate);
        setRatings(ratings);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.matches("^[A-Z][A-Za-z\\s]{0,49}$")){
            this.title = title;
        } else {
            throw new IllegalArgumentException(title + " was received, valid title contains only letters");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages > 0 && pages <= 1000){
            this.pages = pages;
        } else {
            throw new IllegalArgumentException(pages + "was received, the valid number of pages lies between 1 to 1000");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author.matches("^[A-Z][A-Za-z\\s.]{0,49}$")){
            this.author = author;
        } else {
            throw new IllegalArgumentException(author + "was received, the valid author name contains only letters from a/A to z/Z");
        }
    }

    public String getType() {
        return type;
    }

    public List<String> getValidBookTypes(){
        return Arrays.asList("classics", "crime", "novel", "fiction", "story", "horror", "educational", "humor and satire", "business", "strategy", "auto biography", "biography");
    }
    public void setType(String type) {
        if(getValidBookTypes().contains(type)){
            this.type = type;
        } else {
            throw new IllegalArgumentException(type + "was received, valid types are: " + getValidBookTypes());
        }
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        LocalDate minDate = LocalDate.parse("1910-01-01"); // minimum date
        LocalDate maxDate = LocalDate.now(); // maximum date (current date)

        if(releaseDate.isAfter(minDate) && releaseDate.isBefore(maxDate)){
            this.releaseDate = releaseDate;
        } else {
            throw new IllegalArgumentException(releaseDate + " was received, valid date is dates from 1990-01-01 to the present date");
        }
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        if(ratings > 0.0 && ratings <= 5.0){
            this.ratings = ratings;
        } else {
            throw new IllegalArgumentException(ratings + " was received, valid ratings lies between 0.1 to 5.0");
        }
    }

    public String toString(){
        return String.format("%s by %s", title, author);
    }
}
