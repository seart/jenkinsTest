package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: 钱成海
 * @create: 2018-11-01 20:41
 */
@RestController
public class TestController {

    @GetMapping("/jenkins")
    public String getJenkins(){
        return "This is a test";
    }
}
