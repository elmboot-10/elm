package com.neusoft.elmboot.mapper;
import com.neusoft.elmboot.po.Department;
import com.neusoft.elmboot.po.Figure;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Department> selectDeptList();
    Integer isExistDept(Department dept);
    int insert(Department dept);
    //修改
    @Update("UPDATE `dept` SET `dname`=#{dname},`location`=#{location},`setuptime`=#{setuptime} WHERE `deptno`=#{deptno} ")
    public int update(Department dept);
    //删除
    @Delete("delete from dept where deptno=#{deptno}")
    public int delete(Department dept);
}