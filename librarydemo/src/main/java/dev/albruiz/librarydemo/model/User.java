package dev.albruiz.librarydemo.model;

import java.util.ArrayList;
import java.util.List;

public class User implements IUser {

    List<IBook> books = new ArrayList<>();

    String name;
    @Override
    public IBook rentBook(IBook book) {
        books.add(book);
        return book;
    }

    @Override
    public IBook returnBook(IBook book) {
        books.remove(book);
        return  book;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IBook[] getBooks() {
        return this.books.toArray(new IBook[books.size()]);
    }

    public User(String name){
        this.name = name;
    }
}
