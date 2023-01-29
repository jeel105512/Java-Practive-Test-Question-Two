package com.example.books;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookShelf;

    public Library(){
        bookShelf = new ArrayList<>();
    }

    /**
     * This method adds a book to the library
     * @param book
     */
    public void addBookToLibrary(Book book){
        bookShelf.add(book);
    }

    /**
     * This method removes the book from the library
     * @param book
     */
    public void removeBookToLibrary(Book book){
        bookShelf.remove(book);
    }

    /**
     * This method returns all the books who have the same author
     * @param author
     * @return
     */
    public String bookByAuthor(String author){
        String books = "";
        for(Book book : bookShelf){
            if(book.getAuthor() == author){
                books += book.getTitle().toString() + ", ";
            }
        }
        return books.substring(0, books.length() - 2);
    }

    /**
     * This method returns all the books who have the same book type
     * @param type
     * @return
     */
    public String bookByType(String type){
        String books = "";
        for(Book book : bookShelf){
            if(book.getType() == type){
                books += book.getTitle().toString() + ", ";
            }
        }
        return books.substring(0, books.length() - 2);
    }

    /**
     * This method returns all the books who have the same number of pages
     * @param pages
     * @return
     */
    public String bookByPages(int pages){
        String books = "";
        for(Book book : bookShelf){
            if(book.getPages() == pages){
                books += book.getTitle().toString() + ", ";
            }
        }
        return books.substring(0, books.length() - 2);
    }

    /**
     * This method returns all the books who have the same ratings
     * @param rating
     * @return
     */
    public String bookByRating(double rating){
        String books = "";
        for(Book book : bookShelf){
            if(book.getRatings() == rating){
                books += book.getTitle().toString() + ", ";
            }
        }
        return books.substring(0, books.length() - 2);
    }
}