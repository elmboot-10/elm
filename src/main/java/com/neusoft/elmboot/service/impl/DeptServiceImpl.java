package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.DeptMapper;
import com.neusoft.elmboot.po.Department;
import com.neusoft.elmboot.service.DeptService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
    @Override
    public List<Department> selectDeptList() {
        return deptMapper.selectDeptList();
    }
    @Override
    public Integer isExistDept(Department dept){
        return deptMapper.isExistDept(dept);
    }
    @Override
    public int insert(Department dept){
        return deptMapper.insert(dept);
    }
}
