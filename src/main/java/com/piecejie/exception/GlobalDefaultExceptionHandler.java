package com.piecejie.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by with IntelliJ IDEA.
 * User: ${user}
 * Date: 2017/6/12
 * Time: 16:43
 * 全局异常类处理
 */
@ControllerAdvice//此注解一般用作处理系统error，拦截出错信息，返回报错提示界面，防止用户看到一推出错信息！
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, Exception e) {
        //打印异常信息
        e.printStackTrace();
        System.out.println("GlobalDefultExceptionHandler.defaultErrorHandler()");
       /*
        * 返回json数据或者String数据：
        * 那么需要在方法上加上注解：@ResponseBody
        * 添加return即可。
        */

       /*
        * 返回视图：
        * 定义一个ModelAndView即可，
        * 然后return;
        * 定义视图文件(比如：error.html,error.ftl,error.jsp);
        *
        */
    }
}
