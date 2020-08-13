package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Talent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TalentMapper {
    List<Talent> selectTalentList();
    List<Talent> getTalentListPage(Map<String,Integer> map);
    int counts(Map<String,Integer> map);
}