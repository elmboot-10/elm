package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.StaffMapper;
import com.neusoft.elmboot.po.Staff;
import com.neusoft.elmboot.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffMapper staffMapper;

    @Override
    public Integer isExistStaff(Staff staff) {
        return staffMapper.isExistStaff(staff);
    }


    @Override
    public int dataEntry(Staff staff) {
        return staffMapper.dataEntry(staff);
    }

}