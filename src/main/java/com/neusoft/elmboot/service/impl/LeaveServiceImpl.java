package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.LeaveMapper;
import com.neusoft.elmboot.po.Figure;
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
    public List<Leave> selectLeaveList(Leave leave) {
        return leaveMapper.selectLeaveList(leave);}
     @Override
     public Leave getLeaveById(Leave leave) {
            return leaveMapper.getLeaveById(leave.getLeaveId());
        }
    @Override
    public int insert(Leave leave) {
        return leaveMapper.insert(leave);
    }
     @Override
      public int update(Leave leave) {

        return leaveMapper.update(leave);
        }
    @Override
    public int delete(Leave leave) {
        return leaveMapper.delete(leave);
    }
    @Override
    public Integer isExistLeave(Leave leave){
        return leaveMapper.isExistLeave(leave);
    }


    }

