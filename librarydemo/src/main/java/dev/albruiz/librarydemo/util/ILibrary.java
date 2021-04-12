package dev.albruiz.librarydemo.util;

import dev.albruiz.librarydemo.model.IAuthor;
import dev.albruiz.librarydemo.model.IBook;
import dev.albruiz.librarydemo.model.IUser;

import java.util.ArrayList;
import java.util.List;

public interface ILibrary {

    IBook[] getBooks();
    IAuthor[] getAuthors();
    IUser[] getUsers();

    IUser findUser(String name);
    IBook findBook(String name);
    IAuthor findAuthor(String name);

    IUser rentBook(IUser user,IBook book);
    IUser returnBook(IUser user,IBook book);

    IUser addUser(String userName);
    IBook addBook(String bookName, IAuthor author);
    IAuthor addAuthor(String authorName, int year);
}
