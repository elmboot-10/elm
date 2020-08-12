package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.Talent;

import java.util.List;
import java.util.Map;

public interface TalentService {
    List<Talent> selectTalentList();
    List<Talent> getTalentListPage(Map<String,Object> map);
    int counts(Map<String,Object> map);
}