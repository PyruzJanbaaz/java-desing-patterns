package com.pyruz.iterator.pattern;

import com.pyruz.iterator.pattern.impl.BookIterator;
import com.pyruz.iterator.pattern.intrface.Iterator;
import com.pyruz.iterator.pattern.model.Book;

public class Library {
    private Book[] books;

    public Library() {
        books = new Book[5];
        books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        books[2] = new Book("1984", "George Orwell", 1949);
        books[3] = new Book("Pride and Prejudice", "Jane Austen", 1813);
        books[4] = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
    }

    public Iterator createIterator() {
        return new BookIterator(this.books);
    }
}
