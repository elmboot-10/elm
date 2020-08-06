package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.MypostMapper;
import com.neusoft.elmboot.po.Mypost;
import com.neusoft.elmboot.service.MypostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MyPostServiceImpl implements MypostService {
    @Resource
    private MypostMapper mypostMapper;
    @Override
    public List<Mypost> selectMypostList(){
        return  mypostMapper.selectMypostList();
    }
}
