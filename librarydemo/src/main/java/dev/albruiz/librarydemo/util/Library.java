package dev.albruiz.librarydemo.util;

import dev.albruiz.librarydemo.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library implements  ILibrary{

    List<IBook> books = new ArrayList<>();
    List<IAuthor> authors = new ArrayList<>();
    List<IUser> users = new ArrayList<>();

    @Override
    public IBook[] getBooks() {
        return this.books.toArray(new IBook[this.books.size()]);
    }

    @Override
    public IAuthor[] getAuthors() {
        return this.authors.toArray(new IAuthor[this.authors.size()]);
    }

    @Override
    public IUser[] getUsers() {
        return this.users.toArray(new IUser[this.users.size()]);
    }

    @Override
    public IUser findUser(String name) {
        for (IUser user: users) {
            if (user.getName().equals(name)) return user;
        }
        return null;
    }

    @Override
    public IBook findBook(String name) {
        for (IBook book: books) {
            if (book.getName().equals(name)) return book;
        }
        return null;
    }

    @Override
    public IAuthor findAuthor(String name) {
        for (IAuthor author: authors) {
            if (author.getName().equals(name)) return author;
        }
        return null;
    }

    @Override
    public IUser rentBook(IUser user, IBook book) {
        user.rentBook(book);
        return user;
    }

    @Override
    public IUser returnBook(IUser user, IBook book) {
        return null;
    }

    @Override
    public IUser addUser(String userName) {
        IUser user = new User(userName);
        users.add(user);
        return  user;
    }

    @Override
    public IBook addBook(String bookName, IAuthor author) {
        IBook book = new Book(bookName,author);
        books.add(book);
        return  book;
    }

    @Override
    public IAuthor addAuthor(String authorName,int year) {
        IAuthor author = new Author(authorName,year);
        authors.add(author);
        return author;
    }
}
