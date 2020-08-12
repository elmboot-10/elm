package com.neusoft.elmboot.service;

import com.neusoft.elmboot.po.Position;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PositionService {
    List<Position> selectPositionList();
    public Position getPositionById(@RequestBody Position position);
    public int insert(Position position);
    public int update(Position position);
    public int delete(Position position);

}
