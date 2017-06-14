package com.piecejie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by with IntelliJ IDEA.
 * User: ${user}
 * Date: 2017/6/12
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@ServletComponentScan
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
