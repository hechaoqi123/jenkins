package com.study.jinkens;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JinkensApplication {
    public static void main(String[] args) {
       SpringApplication.run(JinkensApplication.class,args);
       /*  取消打印SpringBoot的LOGO
       SpringApplication app=new SpringApplication(JinkensApplication.class);
         app.setBannerMode(Banner.Mode.OFF);
         app.run(args);*/
    }

}
