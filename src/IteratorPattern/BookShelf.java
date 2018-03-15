package IteratorPattern;

import IteratorPattern.Aggregate;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    //private Book[] books;
    private ArrayList books;
    private int last = 0;

    public BookShelf(int maxsize){
        this.books = new ArrayList(maxsize);
    }
    public Book getBookAt(int index){
        return (Book) books.get(index);
    }
    public void appendBook(Book book){
        books.add(book);
        /*this.books[last] = book;
        last++;*/
    }
    public int getLength(){
        //return last;
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
