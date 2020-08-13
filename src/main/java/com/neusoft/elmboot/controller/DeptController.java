package com.neusoft.elmboot.controller;
import com.neusoft.elmboot.po.Department;
import com.neusoft.elmboot.po.Figure;
import com.neusoft.elmboot.po.Position;
import com.neusoft.elmboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept_manage")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/list")
    public List<Department> getDepartmentList(){
        return deptService.selectDeptList();
    }
    @RequestMapping(value = "/isexistdept")
    public Integer isExistDept(Department dept){
        return deptService.isExistDept(dept);
    }
    @RequestMapping(value = "/insert")
    public int insert(Department dept){
        return deptService.insert(dept);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public int delete(@RequestBody Department dept){
        return deptService.delete(dept);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public int update(@RequestBody Department dept){
        return deptService.update(dept);
    }
}