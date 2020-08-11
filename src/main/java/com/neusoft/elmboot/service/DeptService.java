package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.Department;

import java.util.List;

public interface DeptService {
    List<Department> selectDeptList();
    Integer isExistDept(Department department);
}

