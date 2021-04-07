package dev.albruiz.api2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Api2Application {
    private redisHelper redisHelper = new redisHelper();
    public static void main(String[] args) {

        SpringApplication.run(Api2Application.class, args);
    }


    @GetMapping("/add")
    public String add(@RequestParam(value = "item") String item){
        redisHelper.add(item);
        return String.format("%s added!", item);
    }
    @GetMapping("/del")
    public String del(@RequestParam(value = "item") String item){
        redisHelper.add(item);
        return String.format("%s added!", item);
    }

    @GetMapping("/get")
    public String get(){
        String result = "";

        for (String item:
                redisHelper.get()) {
            result += item + "<br>";
        }
        return result;
    }


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
