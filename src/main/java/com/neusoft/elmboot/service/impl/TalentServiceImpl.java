package com.neusoft.elmboot.service.impl;

import com.neusoft.elmboot.mapper.TalentMapper;
import com.neusoft.elmboot.po.Talent;
import com.neusoft.elmboot.service.TalentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TalentServiceImpl implements TalentService {
    @Resource
    private TalentMapper talentMapper;

    @Override
    public List<Talent> selectTalentList() {
        return talentMapper.selectTalentList();
    }
    @Override
    public List<Talent> getTalentListPage(Map<String,Integer> map) {
        return talentMapper.getTalentListPage(map);
    }
    @Override
    public int counts(Map<String,Integer> map) {
        return talentMapper.counts(map);
    }


}