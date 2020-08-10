package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.Leave;
import com.neusoft.elmboot.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/user")
public class LeaveController {
        @Autowired
        private LeaveService leaveService;
        @RequestMapping("/leavelist")
        public List<Leave> getLeaveList(){
            return leaveService.selectLeaveList();
        }
    }

