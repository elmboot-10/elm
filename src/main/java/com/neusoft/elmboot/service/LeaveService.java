package com.neusoft.elmboot.service;

import com.neusoft.elmboot.po.Leave;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

public interface LeaveService {
    List<Leave> selectLeaveList(Leave leave);
    public Leave getLeaveById(@RequestBody Leave leave);
    public int insert(Leave leave);
    public int update(Leave leave);
    public int delete(Leave leave);
}
