package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> selectUserList();
    Integer isExistUser(User user);
    int insert(User user);

    int dataEntry(User user);
    @Select("select * from emp where job=#{job}")
    public User getUserById(Integer job);
    @Delete("delete from emp where empno=#{empno}")
    public int delete(User user);


}