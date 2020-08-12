package com.neusoft.elmboot.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

   private int deptno;
   private String dname;
   private String location;
   private String tel;
   private Date setuptime;
}