package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Position;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PositionMapper {
    List<Position> selectPositionList();
    //添加
    @Insert("insert into job(jnum,jname,jtype)" +
            " values(#{jnum},#{jname},#{jtype})")
    public int insert(Position position);
    //修改
    @Update("UPDATE `job` SET `jname`=#{jname},`jtype`=#{jtype} WHERE `jnum`=#{jnum} ")
    public int update(Position position);
    //删除
    @Delete("delete from job where jnum=#{jnum}")
    public int delete(Position position);

    @Select("select * from job where jnum=#{jnum}")
    Position getPositionById(String jnum);
}
