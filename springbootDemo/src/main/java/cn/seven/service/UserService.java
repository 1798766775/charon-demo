package cn.seven.service;

import cn.seven.model.User;

import java.util.List;

/**
 * InterfaceName:    UserService
 * Package:    cn.seven.service
 * Description: 接口类
 * Datetime:    2020/5/5   14:53
 *
 * @Author: charon
 */
public interface UserService {

    /**
     * 查询所有的数据
     * @return list
     */
    List<User> selectByAll();

    /**
     * 根据主键查询id
     * @param id id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 登录验证
     * @param user 参数
     * @return 返回结果
     */
    int login(User user);

}
