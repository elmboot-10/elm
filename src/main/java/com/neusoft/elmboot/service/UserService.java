package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.User;
import org.springframework.stereotype.Service;
import java.util.List;
public interface UserService {
    List<User> selectUserList();
}

