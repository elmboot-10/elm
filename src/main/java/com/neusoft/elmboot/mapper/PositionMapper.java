package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Position;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PositionMapper {
    List<Position> selectPositionList();
}
