package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public List<User> getUserList(){
        return userService.selectUserList();
    }

    @RequestMapping(value="/isexistuser")
    public Integer isExistUser(User user){
        System.out.println("+++++++++++++"+user);
        return userService.isExistUser(user);
    }


    @RequestMapping(value="/insert")
    public int insert(User user)
    {
        return userService.insert(user);
    }

    @RequestMapping(value="/dataEntry",method = RequestMethod.POST)
    public int dataEntry(@RequestBody User user)
    {
        return userService.dataEntry(user);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public int delete(@RequestBody User user){return userService.delete(user);}
}