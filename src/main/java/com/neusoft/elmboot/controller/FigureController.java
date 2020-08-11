package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Figure;
import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.FigureService;
import com.neusoft.elmboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/figure")
public class FigureController {
    @Autowired
    private FigureService figureService;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Figure getFigureByPassword(Figure figure){
        return figureService.getFigureByPassword(figure);
    }
    @RequestMapping(value = "/isexistuser")
    public Integer isExistFigure(Figure figure){
//        System.out.println("===="+figure);
        return figureService.isExistFigure(figure);
    }
    @RequestMapping(value = "/insert")
    public int insert(Figure figure){
        return figureService.insert(figure);
    }
}
