package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.util.List;

public interface UserService {
    List<User> selectUserList();
    Integer isExistUser(User user);
    int insert(User user);
    int dataEntry(User user);

    int delete(User user);
    public User getUserById(@RequestBody User user);

}