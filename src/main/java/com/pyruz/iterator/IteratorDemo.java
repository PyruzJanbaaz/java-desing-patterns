package com.pyruz.iterator;

import com.pyruz.iterator.pattern.Library;
import com.pyruz.iterator.pattern.intrface.Iterator;
import com.pyruz.iterator.pattern.model.Book;

public class IteratorDemo {

    public static void main(String[] args) {
        Library library = new Library();
        Iterator iterator = library.createIterator();

        System.out.println("Books in the library:");
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Title: " + book.title() + ", Author: " + book.author() + ", Year: " + book.year());
        }

    }
}
