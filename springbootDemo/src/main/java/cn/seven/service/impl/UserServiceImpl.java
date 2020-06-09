package cn.seven.service.impl;

import cn.seven.mapper.UserMapper;
import cn.seven.model.User;
import cn.seven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:    UserServiceImpl
 * Package:    cn.seven.service.impl
 * Description:
 * Datetime:    2020/5/5   14:53
 *
 * @Author: charon
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectByAll() {
        return userMapper.selectByAll();
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int login(User user) {
        int iCount = userMapper.queryUserByUserNameAndPassword(user);
        return iCount;
    }

}
