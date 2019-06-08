package com.study.jinkens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController
public class JinkensApplication {

    public static void main(String[] args) {
        SpringApplication.run(JinkensApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "hello world!"+format.format(new Date());
    }
}
