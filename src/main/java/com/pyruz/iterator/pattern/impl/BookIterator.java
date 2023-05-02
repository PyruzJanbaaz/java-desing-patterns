package com.pyruz.iterator.pattern.impl;

import com.pyruz.iterator.pattern.intrface.Iterator;
import com.pyruz.iterator.pattern.model.Book;

public class BookIterator implements Iterator {
    private final Book[] books;
    private int position;

    public BookIterator(Book[] books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.books.length && this.books[position] != null;
    }

    @Override
    public Object next() {
        return this.books[this.position++];
    }
}
