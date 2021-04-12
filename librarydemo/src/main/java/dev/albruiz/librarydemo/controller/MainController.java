package dev.albruiz.librarydemo.controller;


import dev.albruiz.librarydemo.util.ILibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController implements IMainController {


    @Autowired
    MainController(ILibrary library){
        this.library = library;
    }

    ILibrary library;

    @Override
    @GetMapping("/")
    public String root() {
        return "Server Working ✅";
    }

    @GetMapping("/test/{content}")
    public String test1(@PathVariable String content){
        return content;
    }

    @GetMapping("/lib")
    @ResponseBody
    public ILibrary  getLIbrary(){
        return this.library;
    }
}
