package com.piecejie.controller;

import com.piecejie.entity.Demo;
import com.piecejie.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by with IntelliJ IDEA.
 * User: J
 * Date: 2017/6/12
 * Time: 16:21
 * 热处理测试,返回json数据测试类
 */
@RestController//此注解相当于同时添加@Controller和@ResponseBody注解。
@RequestMapping("/demo")//这个注解起到路由的作用。
public class DemoController {
    @Resource
    private DemoService demoService;

    /**
     * 测试返回json数据
     *
     * @return
     */
    @RequestMapping("/getDemo")
    public Demo getDemo() {
        Demo demo = new Demo();
        demo.setId(10);
        demo.setName("admins");
        return demo;
    }

    /**
     * 测试全局捕捉异常处理
     *
     * @return
     */
    @RequestMapping("zeroException")
    public int zeroException() {
        return 100 / 0;
    }

    /**
     * 测试保存数据方法
     *
     * @return
     */
    @RequestMapping("/save")
    public String saveDemo() {
        Demo demo = new Demo();
        demo.setName("测试2");
        demoService.save(demo);
        return "ok.DemoController.save";
    }

}
