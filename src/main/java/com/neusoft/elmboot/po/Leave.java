package com.neusoft.elmboot.po;

public class Leave {
    private String userId;
    private String leaveName;
    private String bmName;
    private String gwName;
    private String enTime;
    private String leaveTime;
    private String leaveTt;
    private String leaveReason;

    public  Leave(){}
    public  Leave(String userId,String leaveName,String bmName,String gwName,String enTime,String leaveTime,String leaveTt,String leaveReason)
    {
        this.userId =userId;
        this.leaveName= leaveName;
        this.bmName = bmName;
        this.gwName=gwName;
        this.enTime=enTime;
        this.leaveTime=leaveTime;
        this.leaveTt=leaveTt;
        this.leaveReason=leaveReason;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public String getBmName() {
        return bmName;
    }

    public void setBmName(String bmName) {
        this.bmName = bmName;
    }

    public String getGwName() {
        return gwName;
    }

    public void setGwName(String gwName) {
        this.gwName = gwName;
    }

    public String getEnTime() {
        return enTime;
    }

    public void setEnTime(String enTime) {
        this.enTime = enTime;
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getLeaveTt() {
        return leaveTt;
    }

    public void setLeaveTt(String leaveTt) {
        this.leaveTt = leaveTt;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }
}
