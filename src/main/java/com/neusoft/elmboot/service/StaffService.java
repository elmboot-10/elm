package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.Staff;


public interface StaffService {
    Integer isExistStaff(Staff staff);
    int dataEntry(Staff staff);
}