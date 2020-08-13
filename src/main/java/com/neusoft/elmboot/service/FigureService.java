package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.Figure;

public interface FigureService {
    Figure getFigureByPassword(Figure figure);
    Integer isExistFigure(Figure figure);
    int insert(Figure figure);
}

