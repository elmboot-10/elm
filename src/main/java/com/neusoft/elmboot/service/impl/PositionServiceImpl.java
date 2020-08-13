package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.PositionMapper;
import com.neusoft.elmboot.po.Position;
import com.neusoft.elmboot.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Resource
    private PositionMapper positionMapper;
    @Override
    public List<Position> selectPositionList (){
    return  positionMapper.selectPositionList();
}

@Override
public int insert(Position position){
    return positionMapper.insert(position);
}
    @Override
    public int update(Position position){
        return positionMapper.update(position);
    }
    @Override
    public int delete(Position position){
        return positionMapper.delete(position);
    }

    @Override
    public Position getPositionById(Position position) {
        return positionMapper.getPositionById(position.getJnum());
    }
}
