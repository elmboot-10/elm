package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.Department;
import com.neusoft.elmboot.po.Figure;
import com.neusoft.elmboot.po.Position;

import java.util.List;

public interface DeptService {
    List<Department> selectDeptList();
    Integer isExistDept(Department dept);
    int insert(Department dept);
    int update(Department dept);
    int delete(Department dept);
}

