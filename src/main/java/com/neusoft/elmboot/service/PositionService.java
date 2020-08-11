package com.neusoft.elmboot.service;

import com.neusoft.elmboot.po.Department;
import com.neusoft.elmboot.po.Position;

import java.util.List;

public interface PositionService {
    List<Position> selectPositionList();
    Integer isExistJob(Position position);
}
