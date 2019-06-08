package com.study.jinkens.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * fileName:TestController
 * description:
 * author:hcq
 * createTime:2019-06-08 19:03
 */
@RestController
@Slf4j
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         log.info(">>>>>打印日志<<<<<");
        return "hello world!"+format.format(new Date());
    }
}
