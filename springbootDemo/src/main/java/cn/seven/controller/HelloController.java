package cn.seven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:    HelloController
 * Package:    cn.seven.controller
 * Description:
 * Datetime:    2020/5/4   21:16
 *
 * @Author: charon
 */
@Controller
public class HelloController {

    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){
        return "hello Spring boot";
    }
}
