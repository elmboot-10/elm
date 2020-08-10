package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.UserMapper;
import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.UserService;
import org.springframework.stereotype.Service;

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


}