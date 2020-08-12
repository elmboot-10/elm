package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Position;
import com.neusoft.elmboot.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value ="/insert",method = RequestMethod.POST)
    public int insert(@RequestBody Position position){
        return positionService.insert(position);
    }

    @RequestMapping(value = "/delete")
    public int delete(@RequestBody Position position){
        return positionService.delete(position);
    }

    @RequestMapping(value = "/update")
    public int update(@RequestBody Position position){
        return positionService.update(position);
    }


}
