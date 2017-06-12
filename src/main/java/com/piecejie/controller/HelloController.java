package com.piecejie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by with IntelliJ IDEA.
 * User: ${user}
 * Date: 2017/6/12
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
