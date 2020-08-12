package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Staff;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StaffMapper {
    Integer isExistStaff(Staff staff);

    int dataEntry(Staff staff);
}