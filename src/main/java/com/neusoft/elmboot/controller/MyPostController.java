package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Mypost;

import com.neusoft.elmboot.service.MypostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@RequestMapping("/mypost")
public class MyPostController {
    @Autowired
    private MypostService myPostService;
    @RequestMapping("/list")
    public List<Mypost> getDepartmentList(){
        return myPostService.selectMypostList();
    }
}
