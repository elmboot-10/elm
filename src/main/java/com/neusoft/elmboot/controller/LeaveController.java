package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Figure;
import com.neusoft.elmboot.po.Leave;
import com.neusoft.elmboot.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
@RestController
@RequestMapping("/leave_mag")
public class LeaveController {
    @Autowired
    private LeaveService leaveService;
   @RequestMapping(value = "/list",method = RequestMethod.POST)
   public List<Leave> getLeaveList(Leave leave){
            return leaveService.selectLeaveList(leave);
        }

    @RequestMapping(value = "/insert")
    public int insert(Leave leave){
        return leaveService.insert(leave);
    }

    @RequestMapping(value = "/getLeaveById",method = RequestMethod.POST)
    public Leave getLeaveById(@RequestBody Leave leave){
       return leaveService.getLeaveById(leave);}
    @RequestMapping(value = "/update",method = RequestMethod.POST)
     public int update(@RequestBody Leave leave){
        System.out.println(leave.getUserId());
        System.out.println(leave.getLeaveName());
        System.out.println(leave.getLeaveTime());
        System.out.println(leave.getLeaveTt());
        System.out.println(leave.getLeaveReason());
         return leaveService.update(leave);
   }
     @RequestMapping(value = "/delete",method = RequestMethod.POST)
     public int delete(@RequestBody Leave leave){
             return leaveService.delete(leave);
         }
    @RequestMapping(value = "/isexistleave")
    public Integer isExistLeave(Leave leave){
        return leaveService.isExistLeave(leave);
    }
}