package cn.seven.controller;

import cn.seven.model.User;
import cn.seven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:    UserController
 * Package:    cn.seven.controller
 * Description: 使用@RestController注解，@RestController = @Controller + @ResponseBody
 * Datetime:    2020/5/5   9:41
 *
 * @Author: charon
 */
@RestController
public class UserController {

    @Autowired
    private UserService userServiceImpl;


    /**
     * 获取数据
     * @return list
     */
    @RequestMapping(value="/boot/getUser",method = RequestMethod.GET)
    public List<User> getUser(){
        List<User> lstUser= userServiceImpl.selectByAll();
        System.out.println(lstUser);
        return lstUser;
    }

    /**
     * 测试restFul接口
     * @param id id
     * @return
     */
    @RequestMapping(value="/boot/getUserById/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Integer id){
        User lstUser= userServiceImpl.selectByPrimaryKey(id);
        System.out.println(lstUser);
        return lstUser;
    }

}
