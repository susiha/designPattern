package com.susiha.iterator.interImpl;

import com.susiha.iterator.inter.Iterator;

public class BookShelfIterator implements Iterator {

    private BookShelf mBookShelf;
    private int  index;

    public BookShelfIterator(BookShelf bookShelf){
        this.mBookShelf = bookShelf;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index<mBookShelf.getSize();
    }
    @Override
    public Object next() {
        return mBookShelf.getBookAt(index++);
    }
}
