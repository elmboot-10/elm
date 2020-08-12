package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Staff;
import com.neusoft.elmboot.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping(value="/isExistStaff")
    public Integer isExistStaff(Staff staff){
        System.out.println("+++++++++++++"+staff);
        return staffService.isExistStaff(staff);
    }

    @RequestMapping(value="/dataEntry",method = RequestMethod.POST)
    public int dataEntry(@RequestBody Staff staff)
    {
        return staffService.dataEntry(staff);
    }
}