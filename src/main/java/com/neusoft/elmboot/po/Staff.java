package com.neusoft.elmboot.po;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private String empno;
    private String empname;
    private Date birthday;
    private String idNum;
    private String deptname;
    private String job;
    private Date entrydate;
    private Date workdate;
    private String empform;
    private String source;
    private String tel;
    private String email;
}