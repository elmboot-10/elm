package com.neusoft.elmboot.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Talent {
    private String tname;
    private String tel;
    private String email;
    private String idNum;
    private Integer pageSize;
    private Integer pageNo;
}
