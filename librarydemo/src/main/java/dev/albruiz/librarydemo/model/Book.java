package dev.albruiz.librarydemo.model;

public class Book implements IBook {
    String name;
    IAuthor author;

    public Book(String name, IAuthor author){
        this.name = name;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IAuthor getAuthor() {
        return author;
    }
}
