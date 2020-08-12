package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.FigureMapper;
import com.neusoft.elmboot.po.Figure;
import com.neusoft.elmboot.service.FigureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FigureServiceImpl implements FigureService {
    @Resource
    private FigureMapper figureMapper;
    @Override
    public Figure getFigureByPassword(Figure figure) {
        return figureMapper.getFigureByPassword(figure);
    }
    @Override
    public Integer isExistFigure(Figure figure){
        return figureMapper.isExistFigure(figure);
    }
    @Override
    public int insert(Figure figure){
        return figureMapper.insert(figure);
    }
}
