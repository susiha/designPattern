package com.susiha.iterator;

import com.susiha.iterator.inter.Iterator;
import com.susiha.iterator.interImpl.BookShelf;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("AAA","James"));
        bookShelf.addBook(new Book("BBB","Tomes"));
        bookShelf.addBook(new Book("CCC","Janes"));
        bookShelf.addBook(new Book("TTT","DaLian"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
