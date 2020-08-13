package com.neusoft.elmboot.mapper;

import com.neusoft.elmboot.po.Leave;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface LeaveMapper {
    List<Leave> selectLeaveList(Leave leave);
    @Select(" SELECT  l.`leaveId` leaveId,l.`UserId` userId,l.`name` leaveName,d.`dname` bmName,j.`jname` gwName,e.`entime` enTime,l.`date` leaveTime,l.`type` leaveTt,l.`Talent-pool` leaveReason\n" +
            "        FROM `leave` l,`dept` d, `emp` e,`job` j" +
            "        WHERE l.`UserId` =e.`num` AND e.`job` =j.`jnum` AND e.`deptno` =d.`deptno` And leaveId=#{leaveId}")
    Leave getLeaveById(Integer leaveId);
    @Insert("insert into leave(leaveId,userId,leaveName,bmName,gwName,enTime,leaveTime,leaveTt,leaveReason)" +
            " values(#{leaveId},#{userId},#{leaveName},#{bmName},#{gwName},#{enTime},#{leaveTime},#{leaveTt},#{leaveReason})")
    public int insert(Leave leave);
    @Update("UPDATE `Leave` SET `userId`=#{userId},`leaveName`=#{leaveName},`bmName`=#{bmName},`gwName`=#{gwName}," +
            "`enTime`=#{enTime},`leaveTime`=#{leaveTime},`leaveTt`=#{leaveTt},`leaveReason`=#{leaveReason} WHERE `leaveId`=#{leaveId} ")
    public int update(Leave leave);
    @Delete("delete from leave where leaveId=#{leaveId}")
    public int delete(Leave leave);
}
