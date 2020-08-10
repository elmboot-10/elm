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
}
