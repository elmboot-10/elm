package com.neusoft.elmboot.service;

import com.neusoft.elmboot.po.Position;

import java.util.List;

public interface PositionService {
    List<Position> selectPositionList();
    public int insert(Position position);
    public int update(Position position);
    public int delete(Position position);
}
