package dev.albruiz.librarydemo.controller;

import dev.albruiz.librarydemo.model.IAuthor;
import dev.albruiz.librarydemo.model.IBook;
import dev.albruiz.librarydemo.model.IUser;
import dev.albruiz.librarydemo.util.Library;

public interface IAddController {

    IUser addUser(String userName);
    IBook addBook(String bookName, String authorName);
    IAuthor addAuthor(String authorName, int year);
}
