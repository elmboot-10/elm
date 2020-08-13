package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Talent;
import com.neusoft.elmboot.service.TalentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/talent")
public class TalentController {
    @Autowired
    private TalentService talentService;
    @RequestMapping("/list")
    public List<Talent> getTalentList(){
        return talentService.selectTalentList();
    }
    @RequestMapping(value = "/listpage",method = RequestMethod.POST)
    public Map<String,Object> getTalentListPage(@RequestBody Map<String,Integer> map){
        Map<String,Object> resultMap = new HashMap<>();
        List<Talent> talentList = talentService.getTalentListPage(map);
        resultMap.put("talentList",talentList);
        resultMap.put("counts",talentService.counts(map));
        return resultMap;
    }
}