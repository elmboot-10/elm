package com.neusoft.elmboot.mapper;
import com.neusoft.elmboot.po.Department;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface DeptMapper {
     List<Department> selectDeptList();
     Integer isExistDept(Department department);
}