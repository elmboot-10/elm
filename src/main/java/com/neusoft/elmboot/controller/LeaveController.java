package com.neusoft.elmboot.controller;

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

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int insert(@RequestBody Leave leave){
        return leaveService.insert(leave);
    }
    @RequestMapping(value = "/getLeaveById",method = RequestMethod.POST)
    public Leave getLeaveById(@RequestBody Leave leave){
        System.out.println(leave.getLeaveId());
       return leaveService.getLeaveById(leave);}
    @RequestMapping(value = "/update",method = RequestMethod.POST)
     public int update(@RequestBody Leave leave){
         return leaveService.update(leave);
   }
     @RequestMapping(value = "/delete",method = RequestMethod.POST)
     public int delete(@RequestBody Leave leave){
             return leaveService.delete(leave);
         }

}