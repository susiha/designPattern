package com.susiha.iterator.interImpl;

import com.susiha.iterator.Book;
import com.susiha.iterator.inter.Aggregate;
import com.susiha.iterator.inter.Iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    public BookShelf(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    Book getBookAt(int index){
        if(index>=books.size()){
            return null;
        }
        return books.get(index);
    }
    int  getSize(){
        return books.size();
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
