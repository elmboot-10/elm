package com.neusoft.elmboot.po;

public class Department {

    private Integer deptNo;
    private String dName;
    private String deptLoc;

    public Department() {}
    public Department(Integer deptNo, String deptName, String deptLoc) {
        this.deptNo = deptNo;
        this.dName = deptName;
        this.deptLoc = deptLoc;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return dName;
    }

    public void setDeptName(String deptName) {
        this.dName = deptName;
    }

    public String getDeptLoc() {
        return deptLoc;
    }

    public void setDeptLoc(String deptLoc) {
        this.deptLoc = deptLoc;
    }

}