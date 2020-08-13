package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Department;
import com.neusoft.elmboot.po.Leave;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface LeaveMapper {
    List<Leave> selectLeaveList(Leave leave);
    @Select(" SELECT  l.`leaveId` leaveId,l.`userId` userId,l.`leaveName` leaveName,d.`dname` bmName,j.`jname` gwName,e.`entime` enTime,l.`leaveTime` leaveTime,l.`leaveTt` leaveTt,l.`leaveReason` leaveReason\n" +
            "        FROM `leave` l,`dept` d, `emp` e,`job` j" +
            "        WHERE l.`userId` =e.`num` AND e.`job` =j.`jnum` AND e.`deptno` =d.`deptno` And leaveId=#{leaveId}")
    Leave getLeaveById(Integer leaveId);
    @Update("UPDATE `leave` SET `userId`=#{userId},`leaveName`=#{leaveName},`leaveTime`=#{leaveTime},`leaveTt`=#{leaveTt},`leaveReason`=#{leaveReason} WHERE `leaveId`=#{leaveId} ")
    public int update(Leave leave);
    @Delete("delete from `leave` where   leaveId=#{leaveId}")
    public int delete(Leave leave);
    Integer isExistLeave(Leave leave);
    int insert(Leave leave);
}
