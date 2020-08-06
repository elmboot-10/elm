package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Mypost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MypostMapper {
    List<Mypost> selectMypostList();
}
