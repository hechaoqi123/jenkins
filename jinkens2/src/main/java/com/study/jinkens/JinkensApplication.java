package com.study.jinkens;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JinkensApplication {
    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(JinkensApplication.class);
         app.setBannerMode(Banner.Mode.OFF);//取消springBoot的默认logo
         app.run(args);
    }

}
