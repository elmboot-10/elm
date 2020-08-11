package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Department;
import com.neusoft.elmboot.po.Position;
import com.neusoft.elmboot.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posi")
public class PositionController {
    @Autowired
    private PositionService positionService;
    @RequestMapping("/list")
    public List<Position> getPositionList(){
        return positionService.selectPositionList();
    }

    @RequestMapping(value="/isexistjob")
    public Integer isExistJob(Position position){
        System.out.println("+++++++++++++"+position);
        return positionService.isExistJob(position);
    }
}
