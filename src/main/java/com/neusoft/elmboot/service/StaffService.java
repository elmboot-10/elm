package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.Staff;


public interface StaffService {
    Integer isExistStaff(Staff staff);
    Integer isExistDept(Staff staff);
    Integer isExistJob(Staff staff);
    int dataEntry(Staff staff);
}