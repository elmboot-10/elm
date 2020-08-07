package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Figure;
import com.neusoft.elmboot.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FigureMapper {
     Figure getFigureByPassword(Figure figure);
}