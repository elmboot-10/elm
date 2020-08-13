package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.UserMapper;
import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

    @Override
    public Integer isExistUser(User user) {
        return userMapper.isExistUser(user);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int dataEntry(User user) {
        return userMapper.dataEntry(user);
    }

    @Override
    public int delete(User user) {
        return userMapper.delete(user);
    }

    @Override
    public User getUserById( User user){
        return userMapper.getUserById(user.getJob());
    }
}