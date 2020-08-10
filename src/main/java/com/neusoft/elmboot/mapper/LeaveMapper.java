package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Leave;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface LeaveMapper {
    List<Leave> selectLeaveList();
}
