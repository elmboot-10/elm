package com.neusoft.elmboot.po;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int num;
    private String empno;
    private String ename;
    private Date bitrh;
    private String idnum;
    private int deptno;
    private int job;
    private Date entime;
    private Date wtime;
    private String form;
    private String resource;
    private String tel;
    private String email;
}