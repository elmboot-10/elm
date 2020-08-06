package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Mypost;
import com.neusoft.elmboot.service.MypostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mypost")
public class MypostController {
    @Autowired
    private MypostService mypostService;
    @RequestMapping("/list")
    public List<Mypost> getMypostList(){
        return mypostService.selectMypostList();
    }
}
