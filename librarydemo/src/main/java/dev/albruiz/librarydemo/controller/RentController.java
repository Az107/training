package dev.albruiz.librarydemo.controller;


import dev.albruiz.librarydemo.model.IBook;
import dev.albruiz.librarydemo.model.IUser;
import dev.albruiz.librarydemo.util.ILibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Rent")
public class RentController implements IRentController {

    @Autowired
    RentController(ILibrary library){
        this.library = library;
    }

    ILibrary library;

    @GetMapping("/")
    public String root(){
        return "Rent Working ✅";
    }

    @Override
    @GetMapping("/rent/{userName}/{bookName}") //TODO: change to POST
    @ResponseBody
    public IUser RentBook(@PathVariable String bookName,@PathVariable  String userName) {
        IUser user = library.findUser(userName);
        IBook book = library.findBook(bookName);


        if (user != null && book != null){
            return  library.rentBook(user,book);
        }
        return  null;
    }

    @Override
    @GetMapping("/return/{userName}/{bookName}") //TODO: change to POST
    @ResponseBody
    public IUser ReturnBook(@PathVariable String bookName, @PathVariable String userName) {
        IUser user = library.findUser(userName);
        IBook book = library.findBook(bookName);


        if (user != null && book != null){
            return  library.returnBook(user,book);
        }
        return  null;
    }
}
