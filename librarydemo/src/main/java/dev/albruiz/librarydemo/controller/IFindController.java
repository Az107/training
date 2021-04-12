package dev.albruiz.librarydemo.controller;

import dev.albruiz.librarydemo.model.IAuthor;
import dev.albruiz.librarydemo.model.IBook;
import dev.albruiz.librarydemo.model.IUser;

public interface IFindController {

    IUser findUser(String userName);
    IBook findBook(String bookName);
    IAuthor findAuthor(String authorName);
}
