package dev.albruiz.librarydemo.controller;

import dev.albruiz.librarydemo.model.IAuthor;
import dev.albruiz.librarydemo.model.IBook;
import dev.albruiz.librarydemo.model.IUser;
import dev.albruiz.librarydemo.util.ILibrary;
import dev.albruiz.librarydemo.util.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Add")
public class AddController implements IAddController{

    @Autowired
    AddController(ILibrary library){
        this.library = library;
    }

    ILibrary library;

    @GetMapping("/")
    public String root(){
        return "Add Working ✅";
    }

    @Override
    @GetMapping("/addUser/{userName}") //TODO: change to POST
    @ResponseBody
    public IUser addUser(@PathVariable String userName) {
        return this.library.addUser(userName);

    }


    @Override
    @GetMapping("/addBook/{authorName}/{bookName}") //TODO: change to POST
    @ResponseBody
    public IBook addBook(@PathVariable String bookName, @PathVariable String authorName) {
        IAuthor author = library.findAuthor(authorName);
        if (author != null){
            return library.addBook(bookName, author);
        }else{return null;}


    }

    @Override
    @GetMapping("/addAuthor/{year}/{authorName}")  //TODO: change to POST
    @ResponseBody
    public IAuthor addAuthor(@PathVariable String authorName,@PathVariable int year) {
        return library.addAuthor(authorName,year);
    }
}
