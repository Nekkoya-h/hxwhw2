package com.hxw.hw2.mapper;

import com.hxw.hw2.entity.User;
import com.hxw.hw2.entity.UserCustom;
import com.hxw.hw2.entity.UserQueryVO;

import java.util.List;

public interface UserMapper {

    //通过id查询用户信息
    public User findById(Integer id);

    //根据用户名进行模糊查询用户信息
    public List<User> findByName(String username);

    //插入用户信息
    public void insert(User user);
    //修改用户信息
    public void update(User user);
    //删除用户信息
    public void delete(Integer id);
    //通过用户性别和姓名查询用户列表，且id值是15或20或25  PS：不允许性别或者姓名为null或者空串
    public List<UserCustom> findListByIds(UserQueryVO vo);

}
