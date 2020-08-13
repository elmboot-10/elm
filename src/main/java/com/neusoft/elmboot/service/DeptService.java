package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.Department;
import com.neusoft.elmboot.po.Figure;

import java.util.List;

public interface DeptService {
    List<Department> selectDeptList();
    Integer isExistDept(Department dept);
    int insert(Department dept);
}

