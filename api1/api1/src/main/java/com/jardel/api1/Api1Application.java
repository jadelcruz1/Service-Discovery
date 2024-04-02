package com.jardel.api1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class Api1Application {

    public static void main(String[] args) {
        SpringApplication.run(Api1Application.class, args);
    }

}


@RestController
@RequestMapping("api")
class Api1Controller {

    @GetMapping 
    public String getApi1(){
        return "api1 consumida e resgistrada 1";
    }
}

