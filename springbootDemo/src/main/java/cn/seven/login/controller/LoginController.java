package cn.seven.login.controller;

import cn.seven.model.User;
import cn.seven.service.UserService;
import cn.seven.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:    LoginController
 * Package:    cn.seven.login.controller
 * Description: 登录的控制类
 * Datetime:    2020/6/8   17:33
 *
 * @Author: charon
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userServiceImpl;

    /**
     * 使用@RequestBody 获取axios传入的数据
     * @param user
     * @return
     */
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public int login(@RequestBody User user){
        return userServiceImpl.login(user);
    }


}
