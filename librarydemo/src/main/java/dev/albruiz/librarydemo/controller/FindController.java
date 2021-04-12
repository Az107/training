package dev.albruiz.librarydemo.controller;


import dev.albruiz.librarydemo.model.IAuthor;
import dev.albruiz.librarydemo.model.IBook;
import dev.albruiz.librarydemo.model.IUser;
import dev.albruiz.librarydemo.util.ILibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("Find")
public class FindController implements IFindController {


    @Autowired
    FindController(ILibrary library){
        this.library = library;
    }

    ILibrary library;

    @GetMapping("/")
    public String root(){
        return "Find Working ✅";
    }

    @Override
    public IUser findUser(@PathVariable String userName) {
        return null;
    }

    @Override
    @GetMapping("/book/{bookName}")
    public IBook findBook(@PathVariable String bookName) {
        return null;
    }

    @Override
    @GetMapping("/author/{username}")
    public IAuthor findAuthor(@PathVariable String authorName) {
        return null;
    }
}
