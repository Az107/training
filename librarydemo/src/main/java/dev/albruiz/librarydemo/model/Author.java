package dev.albruiz.librarydemo.model;

public class Author implements IAuthor {

    String name;
    int year;

    public Author(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getYear() {
        return year;
    }
}
