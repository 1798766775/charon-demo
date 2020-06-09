package cn.seven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:    JspController
 * Package:    cn.seven.controller
 * Description: 跳转jsp
 * Datetime:    2020/5/5   10:19
 *
 * @Author: charon
 */
@Controller
public class JspController {

    @GetMapping("/boot/index")
    public String index(ModelMap modelMap){
        modelMap.put("msg","springboot继承jsp");
        return "hello";
    }
}
