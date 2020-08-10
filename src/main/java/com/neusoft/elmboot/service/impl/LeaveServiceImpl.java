package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.LeaveMapper;
import com.neusoft.elmboot.po.Leave;
import com.neusoft.elmboot.service.LeaveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Resource
    private LeaveMapper leaveMapper;
    @Override
    public List<Leave> selectLeaveList() {
        return leaveMapper.selectLeaveList();
    }
}
