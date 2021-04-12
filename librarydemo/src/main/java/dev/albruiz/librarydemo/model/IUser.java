package dev.albruiz.librarydemo.model;

import java.util.ArrayList;
import java.util.List;

public interface IUser {

    IBook rentBook(IBook book);
    IBook returnBook(IBook book);

    String getName();
    IBook[] getBooks();




}
