package dev.albruiz.librarydemo.controller;

import dev.albruiz.librarydemo.model.IUser;

public interface IRentController {

    IUser RentBook(String bookName,String userName);
    IUser ReturnBook(String bookName,String UserName);

}
