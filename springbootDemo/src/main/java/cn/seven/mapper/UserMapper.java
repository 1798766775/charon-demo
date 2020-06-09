package cn.seven.mapper;

import cn.seven.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * InterfaceName:    UserMapper
 * Package:    cn.seven.mapper
 * Description:
 * Datetime:    2020/5/5   15:09
 *
 * @Author: charon
 */
@Mapper
public interface UserMapper {
    /**
     * 根据主键删除数据
     * @param id id
     * @return int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入一条数据
     * @param record 记录
     * @return int
     */
    int insert(User record);

    /**
     * 插入数据
     * @param record 记录
     * @return 条数
     */
    int insertSelective(User record);

    /**
     * 根据主键查询
     * @param id id
     * @return user
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 查询所有的记录
     * @return list
     */
    List<User> selectByAll();

    /**
     * 根据主键修改用户
     * @param record 记录
     * @return 条数
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据主键修改用户
     * @param record 记录
     * @return 条数
     */
    int updateByPrimaryKey(User record);

    /**
     * 根据用户名称和用户密码查询用户
     * @param user 参数
     * @return 条数
     */
    int queryUserByUserNameAndPassword(User user);

}
